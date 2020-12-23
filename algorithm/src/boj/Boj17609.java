package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj17609 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			String input = br.readLine();
			if (isPalindrome(input)) {
				sb.append("0");
			} else if (isPseudoPalindrome(input)) {
				sb.append("1");
			} else {
				sb.append("2");
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
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
	
	static boolean isPseudoPalindrome(String input) {
		char[] arr = input.toCharArray();
		int size = arr.length;
		
		for (int i = 0; i < size/2; i++) {
			if (arr[i] != arr[size-1-i]) {
				if (i == 0) {
					return isPalindrome(input.substring(1)) || isPalindrome(input.substring(0, size-1));
				} else {
					return isPalindrome(input.substring(0, i) + input.substring(i+1)) 
							|| isPalindrome(input.substring(0, size-1-i) + input.substring(size-i)); 
				}
			}
		}
		return false;
	}

}
