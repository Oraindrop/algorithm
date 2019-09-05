package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfChar7600 {

	static int[] arr = new int[26];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		while(!s.equals("#")) {
			clear();
			s = s.toLowerCase();
			for (char c : s.toCharArray()) {
				if (c >= 97 && c <= 122) arr[c - 97]++;
			}
			sb.append(count()).append(System.lineSeparator());
			s = br.readLine();
		}
		System.out.print(sb.toString());
	}

	static int count() {
		int answer = 0;
		for (int i : arr) {
			if (i > 0) answer++;
		}
		return answer;
	}
	
	static void clear() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}
}
