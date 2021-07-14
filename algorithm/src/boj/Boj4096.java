package boj;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Boj4096 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		while (!input.equals("0")) {
			String s = input;
			int index = 0;
			while (!isPalindrome(s)) {
				index++;
				s = addOne(s);
			}
			sb.append(index).append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.print(sb.toString());
	}
	
	static boolean isPalindrome(String s) {
		char[] arr = s.toCharArray();
		int size = arr.length;
		for (int i = 0; i < size / 2; i++) {
			if (arr[i] != arr[size - 1 - i]) {
				return false;
			}
		}
		return true;
	}
	
	static String addOne(String s) {
		int num = Integer.parseInt(s);
		String newString = String.valueOf((num+1));
		while (newString.length() < s.length()) {
			newString = "0" + newString;
		}
		return newString;
	}
	
	

}
