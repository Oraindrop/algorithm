package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11722 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		String[] inputArr = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(inputArr[i]);
		}
		
		for (int i = n-1; i >= 0; i--) {
			int max = 0;
			
			for (int j = n-1; j > i; j--) {
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
		
		System.out.println(max);
	}

}
