package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2637 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append("* ");
		}
		String s = sb.toString();
		
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.println(s);
			} else {
				System.out.println(" "+s);
			}
		}
	}
	
}


