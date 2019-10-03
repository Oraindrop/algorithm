package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoitOrNot5789 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			sb.append(go(s)).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

	static String go(String s) {
		int size = s.length();
		String target = s.substring(size/2 - 1, size/2 + 1);
		return target.charAt(0) == target.charAt(1) ? "Do-it" : "Do-it-Not";
	}
}
