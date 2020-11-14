package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10990 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n-i; j++) {
				sb.append(" ");
			}
			sb.append("*");
			
			if (i == 1) {
				sb.append(System.lineSeparator());
				continue;
			}
			
			for (int j = 0; j < 2 * i - 3; j++) {
				sb.append(" ");
			}
			sb.append("*").append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
