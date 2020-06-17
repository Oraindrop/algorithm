package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2445 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int space = 2 * (n-1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				sb.append("*");	
			}
			for (int j = 0; j < space; j++) {
				sb.append(" ");
			}
			space -= 2;
			for (int j = 0; j <= i; j++) {
				sb.append("*");	
			}
			sb.append(System.lineSeparator());
		}
		
		space = 2;
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				sb.append("*");	
			}
			for (int j = 0; j < space; j++) {
				sb.append(" ");
			}
			space += 2;
			for (int j = 0; j < i; j++) {
				sb.append("*");	
			}
			sb.append(System.lineSeparator());
		}
		System.out.println(sb.toString());
		
	}

}
