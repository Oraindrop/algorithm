package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11057 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[1001][10];
		
		for (int i = 0; i < 10; i++) {
			arr[1][i] = 1;
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k <= j; k++) {
					arr[i][j] += arr[i-1][k];
					arr[i][j] %= 10007;
				}
			}
		}
		
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += arr[n][i];
		}
		System.out.println(sum % 10007);
	}

}
