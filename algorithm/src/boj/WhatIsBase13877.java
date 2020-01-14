package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WhatIsBase13877 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			sb.append(st.nextToken());
			String s = st.nextToken();
			sb.append(String.format(" %s %s %s", goOctal(s), Integer.parseInt(s), goHex(s)))
				.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

	private static long goOctal(String s) {
		int max = s.length() - 1;
		long answer = 0;
		for (int j = max; j >= 0; j--) {
			int value = s.charAt(j) - '0';
			
			if (value >= 8) {
				return 0;
			}
			
			answer += value * Math.pow(8, max-j);
		}
		return answer;
	}
	
	private static long goHex(String s) {
		int max = s.length() - 1;
		long answer = 0;
		for (int j = max; j >= 0; j--) {
			int value = s.charAt(j) - '0';
			answer += value * Math.pow(16, max-j);
		}
		return answer;
	}

}
