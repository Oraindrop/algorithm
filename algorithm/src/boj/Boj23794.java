package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj23794 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String middle = "";
		String firstOrLast = "";
		for (int i = 0; i < n+2; i++) {
			if (i == 0 || i == n+1) {
				middle += "@";
			} else {
				middle += " ";
			}
			firstOrLast += "@";
		}
		
		for (int i = 0; i < n+2; i++) {
			if (i == 0 || i == n+1) {
				sb.append(firstOrLast);
			} else {
				sb.append(middle);
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
				
	}

}
