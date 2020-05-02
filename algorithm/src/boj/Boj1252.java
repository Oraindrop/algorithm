package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1252 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		StringBuilder sb = new StringBuilder();
		if (a.length() > b.length()) {
			for (int i = 0; i < a.length() - b.length(); i++) {
				sb.append("0");
			}
			b = sb.toString() + b;
		} else if (b.length() > a.length()) {
			for (int i = 0; i < b.length() - a.length(); i++) {
				sb.append("0");
			}
			a = sb.toString() + a;
		}
		String answer = sum(a,b);
		int count = countFirstZero(answer);
		System.out.println(answer.substring(count));
		
	}
	
	static int countFirstZero(String s) {
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				return i;
			}
		}
		return arr.length-1;
	}
	
	static String sum(String a, String b) {
		int size = a.length();
		int carry = 0;
		String answer = "";
		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();
		for (int i = size-1; i >= 0; i--) {
			int value = (aArr[i] - '0') + (bArr[i] - '0') + carry;
			if (value == 2) {
				carry = 1;
				answer = 0 + answer;
			} else if (value == 3) {
				carry = 1;
				answer = 1 + answer;
			} else {
				carry = 0;
				answer = value + answer;
			}
		}
		
		return carry + answer;
	}

}
