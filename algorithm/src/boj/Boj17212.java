package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj17212 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] coins = {1, 2, 5, 7};
		int[] dp = new int[n+1];
		
		for (int i = 1; i < n+1; i++) {
			dp[i] = n+1;
		}
		
		for (int i = 1; i < n+1; i++) {
			for (int coin : coins) {
				if (i - coin >= 0 && dp[i-coin] + 1 < dp[i]) {
					dp[i] = dp[i-coin] + 1;
				}
			}
		}
		
		System.out.println(dp[n]);
	}

}
