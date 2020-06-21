package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2443 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				sb.append(" ");	
			}
			
			for (int j = 0; j < (2 * (n - i)) - 1; j++) {
				sb.append("*");
			}
			
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
