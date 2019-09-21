package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangram11091 {

	static int[] arr = new int[26];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			clear();

			for (char c : s.toCharArray()) {
				if (c >= 65 && c <= 90) {
					arr[c-65]++;
				} else if (c >= 97 && c <= 122) {
					arr[c-97]++;
				}
			}
			if (isPangram()) {
				sb.append("pangram");
			} else {
				sb.append("missing ").append(findEmpty());
			}
			sb.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}
	
	static void clear() {
		for (int i = 0; i < 26; i++) {
			arr[i] = 0;
		}
	}
	
	static boolean isPangram() {
		for (int i = 0; i < 26; i++) {
			if (arr[i] == 0) return false;
		}
		return true;
	}
	
	static String findEmpty() {
		String s = "";
		for (int i = 0; i < 26; i++) {
			if (arr[i] == 0) s += (char)(i + 97);
		}
		return s;
	}

}
