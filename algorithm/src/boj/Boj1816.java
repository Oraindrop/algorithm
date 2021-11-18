package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			long n = Long.parseLong(br.readLine());
			boolean result = true;
			for (int j = 2; j <= 1000000; j++) {
				if (n % j == 0) {
					result = false;
					break;
				}
			}
			sb.append(result ? "YES" : "NO").append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
