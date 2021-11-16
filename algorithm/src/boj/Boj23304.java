package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj23304 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String pre = input.substring(0, input.length()/2);
		String post = input.length() % 2 == 0 ? input.substring(input.length()/2) : input.substring(input.length()/2 + 1);
		if (isPalindrome(input)) {
			if (isPalindrome(pre) && isPalindrome(post)) {
				System.out.println("AKARAKA");
			} else {
				System.out.println("IPSELENTI");
			}
		} else {
			System.out.println("IPSELENTI");
		}
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
