package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj11145 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String input = br.readLine();
			
			try {
				String trim = input.trim();
				for (int j = 0; j < trim.length(); j++) {
					Integer.parseInt(trim.substring(j, j+1));
				}
				
				BigInteger a = new BigInteger(trim);
				sb.append(a).append(System.lineSeparator());
			} catch (Exception e) {
				sb.append("invalid input").append(System.lineSeparator());
			}
			
		}
		
		System.out.print(sb.toString());
	}

}
