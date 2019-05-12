package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Noise2935 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String op = br.readLine();
		String s2 = br.readLine();
		
		System.out.println(go(s1, s2, op));
	}
	
	private static String go (String s1, String s2, String op) {
		if (op.equals("*")) {
			int n = (s1.length() - 1) + (s2.length() - 1) + 1;
			String answer = "1";
			for (int i = 1; i < n; i++) {
				answer += "0";
			}
			return answer;
		}
		
		if (s1.length() == s2.length()) {
			String answer = "2";
			for (int i = 1; i < s1.length(); i++) {
				answer += "0";
			}
			return answer;
		}
		
		if (s1.length() > s2.length()) {
			return s1.substring(0, s1.length() - s2.length()) + s2;
		}
		
		return s2.substring(0, s2.length() - s1.length()) + s1;
	}

}
