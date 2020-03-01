package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom10174 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			String origin = input.toLowerCase();
			String reverse = reverse(origin);
			sb.append(origin.equals(reverse) ? "Yes" : "No").append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

	static String reverse(String origin) {
		String answer = "";
		for (int i = origin.length() - 1; i >= 0; i--) {
			answer += origin.substring(i, i+1);
		}
		
		return answer;
	}
}
