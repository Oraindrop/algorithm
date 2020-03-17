package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeMaker1254 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int count = go(input);
		System.out.println(input.length() + count);
	}
	static int go(String input) {
		int size = input.length();
		
		if (isPalindrome(input)) {
			return 0;
		}
		
		StringBuilder sb = new StringBuilder(input);
		char[] arr = input.toCharArray();
		
		for (int i = 1; i < size - 1; i++) {
			appendText(i, arr, sb);
			if (isPalindrome(sb.toString())) {
				return i;
			}
			initStringBuilder(input, sb);
		}
		return size - 1;
	}
	
	static void appendText(int count, char[] arr, StringBuilder sb) {
		for (int i = count - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}
	}
	
	static void initStringBuilder(String input, StringBuilder sb) {
		sb.setLength(0);
		sb.append(input);
	}

	static boolean isPalindrome(String s) {
		char[] arr = s.toCharArray();
		int size = s.length();
		
		for (int i = 0; i < size / 2; i++) {
			if (arr[i] != arr[size - 1 - i]) {
				return false;
			}
		}
		
		return true;
	}
}
