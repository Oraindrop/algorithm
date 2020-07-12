package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2631 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < n; i++) {
			int max = 0;
			
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					if (dp[j] > max) {
						max = dp[j];
					}
				}
			}
			
			dp[i] = max + 1;
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (dp[i] > max) {
				max = dp[i];
			}
		}
		
		System.out.println(n - max);
	}

}
