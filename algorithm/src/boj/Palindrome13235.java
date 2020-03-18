package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome13235 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(isPalindrome(br.readLine()));
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
