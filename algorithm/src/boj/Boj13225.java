package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj13225 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					count++;
				}
			}
			sb.append(n).append(" ").append(count).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
