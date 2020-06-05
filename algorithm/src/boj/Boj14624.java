package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14624 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		if (n % 2 == 0) {
			System.out.println("I LOVE CBNU");
		} else {
			for (int i = 0; i < n; i++) {
				sb.append("*");
			}
			sb.append(System.lineSeparator());
			for (int i = 0; i < n / 2; i++) {
				sb.append(" ");
			}
			sb.append("*").append(System.lineSeparator());
			
			int base = (n/2) - 1;
			for (int i = 0; i < base; i++) {
				for (int j = 0; j < base - i; j++) {
					sb.append(" ");
				}
				sb.append("*");
				for (int j = 0; j < (2 * i) + 1; j++) {
					sb.append(" ");
				}
				sb.append("*").append(System.lineSeparator());
			}
			
			sb.append("*");
			for (int i = 0; i < n - 2; i++) {
				sb.append(" ");
			}
			sb.append("*");
			
			System.out.println(sb.toString());
		}
	}

}
