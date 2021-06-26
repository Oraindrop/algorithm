package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj17829 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] answer = go(n, arr);
		System.out.println(answer[0][0]);
	}
	
	private static int[][] go(int n, int[][] arr) {
		if (n == 2) {
			int[][] newArr = new int[1][1];
			newArr[0][0] = getSecond(arr[0][0], arr[0][1], arr[1][0], arr[1][1]);
			return newArr;
		}
		int[][] newArr = new int[n/2][n/2];
		for (int i = 0; i < n; i += 2) {
			for (int j = 0; j < n; j += 2) {
				newArr[i/2][j/2] = getSecond(arr[i][j], arr[i][j+1], arr[i+1][j], arr[i+1][j+1]);
			}
		}
		return go(n/2, newArr);
	}
	
	private static int getSecond(int a, int b, int c, int d) {
		List<Integer> list = Arrays.asList(a, b, c, d);
		Collections.sort(list);
		return list.get(2);
	}

}
