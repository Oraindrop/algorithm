package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj8892 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] arr = new String[n];
			for (int j = 0; j < n; j++) {
				arr[j] = br.readLine();
			}
			sb.append(getPalindrome(arr)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static String getPalindrome(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				if (isPalindrome(arr[i] + arr[j])) {
					return arr[i] + arr[j]; 
				}
			}
		}
		return "0";
	}
	
	static boolean isPalindrome(String input) {
		char[] arr = input.toCharArray();
		int size = arr.length;
		for (int i = 0; i < size/2; i++) {
			if (arr[i] != arr[size-1-i]) {
				return false;
			}
		}
		
		return true;
	}

}
