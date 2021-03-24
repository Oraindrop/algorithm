package boj;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Boj9046 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int[] result = new int[26];
			char[] arr = br.readLine().toCharArray();
			for (char c : arr) {
				if (c >= 'a' && c <= 'z') {
					result[c - 'a']++;
				}
			}
			
			int max = 0;
			for (int e : result) {
				if (e > max) max = e;
			}
			
			int count = 0;
			int answer = 0;
			for (int j = 0; j < 26; j++) {
				if (result[j] == max) {
					count++;
					answer = j;
				}
			}
			
			sb.append(count == 1 ? (char)('a' + answer) : "?").append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
