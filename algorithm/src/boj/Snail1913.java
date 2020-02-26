package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Snail1913 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n+2][n+2];
		
		for (int i = 0; i < n+2; i++) {
			arr[i][0] = -1;
			arr[0][i] = -1;
			arr[n+1][i] = -1;
			arr[i][n+1] = -1;
		}
		
		int max = n * n;
		down(0, 1, max, arr);
		StringBuilder sb = new StringBuilder();
		int a = 0;
		int b = 0;
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {
				if (arr[i][j] == k) {
					a = i;
					b = j;
				}
				sb.append(arr[i][j]).append(" ");
			}
			sb.append(System.lineSeparator());
		}
		sb.append(a).append(" ").append(b);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	static void down(int a, int b, int value, int[][] arr) {
		int index = a+1;
		while (arr[index][b] == 0) {
			arr[index][b] = value;
			index++;
			value--;
		}
		if (value == 0) {
			return;
		}
		right(index-1, b, value, arr);
	}
	
	static void up(int a, int b, int value, int[][] arr) {
		int index = a-1;
		while (arr[index][b] == 0) {
			arr[index][b] = value;
			index--;
			value--;
		}
		left(index+1, b, value, arr);
	}
	
	static void right(int a, int b, int value, int[][] arr) {
		int index = b+1;
		while (arr[a][index] == 0) {
			arr[a][index] = value;
			index++;
			value--;
		}
		up(a, index-1, value, arr);
	}
	
	static void left(int a, int b, int value, int[][] arr) {
		int index = b-1;
		while (arr[a][index] == 0) {
			arr[a][index] = value;
			index--;
			value--;
		}
		down(a, index+1, value, arr);
	}

}
