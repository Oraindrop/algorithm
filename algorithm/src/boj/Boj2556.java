package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2556 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append("*");
		}
		
		String line = sb.toString();
		sb.setLength(0);
		
		for (int i = 0; i < n; i++) {
			sb.append(line).append(System.lineSeparator());
		}
		
		System.out.println(sb.toString());
	}

}
