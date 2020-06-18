package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10996 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String first = "*";
		String second = "";
		
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				second += " *";
			} else {
				first += " *";
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			sb.append(first).append(System.lineSeparator());
			sb.append(second).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
