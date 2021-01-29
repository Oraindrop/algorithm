package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15489 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[][] arr = new int[30][30];
		for (int i = 0; i < 30; i++) {
			arr[i][0] = 1;
		}
		
		for (int i = 1; i < 30; i++) {
			for (int j = 1; j <= i; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		r -= 1;
		c -= 1;
		int sum = 0;
		for (int i = 0; i < w; i++) {
			for (int j = 0; j <= i; j++) {
				sum += arr[r+i][c+j];
			}
		}
		
		System.out.println(sum);
	}

}
