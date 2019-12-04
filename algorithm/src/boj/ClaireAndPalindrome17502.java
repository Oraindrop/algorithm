package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClaireAndPalindrome17502 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String s = br.readLine();
		String rev = reverse(s);
		char[] arr = s.toCharArray();
		char[] revArr = rev.toCharArray();
		String answer = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '?') {
				answer += revArr[i];
			} else {
				answer += arr[i];
			}
		}
		System.out.println(padding(answer));
	}
	
	static String reverse(String s) {
		String reverse = "";
		char[] arr = s.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse += arr[i];
		}
		return reverse;
	}
	
	static String padding(String s) {
		String result = "";
		for (char c : s.toCharArray()) {
			if (c == '?') {
				result += 'a';
			} else {
				result += c;
			}
		}
		return result;
	}

}
