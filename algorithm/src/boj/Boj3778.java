package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3778 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			char[] arr1 = new char[27];
			char[] arr2 = new char[27];
			String s1 = br.readLine().toLowerCase();
			String s2 = br.readLine().toLowerCase();
			
			for (char c : s1.toCharArray()) {
				arr1[c - 'a']++;
			}
			
			for (char c : s2.toCharArray()) {
				arr2[c - 'a']++;
			}
			
			int sum = 0;
			for (int j = 0; j < 27; j++) {
				sum += Math.abs(arr1[j] - arr2[j]);
			}
			
			sb.append("Case #").append((i+1)).append(": ").append(sum).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
