package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctDecHex11816 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String first = s.substring(0, 1);
		int answer = 0;
		if (first.equals("0")) {
			if (s.length() >= 2 && s.substring(0, 2).equals("0x")) {
				answer = goHex(s);
			} else {
				answer = goOct(s);
			}
		} else {
			answer = Integer.parseInt(s);
		}
		System.out.println(answer);
	}
	
	static int goOct(String s) {
		String target = s.substring(1);
		int size = target.length();
		int answer = 0;
		int mul = 1;
		for (int i = 0; i < size; i++) {
			char c = target.charAt(size-1-i);
			answer += (c - 48) * mul;
			mul *= 8;
		}
		return answer;
	}

	static int goHex(String s) {
		String target = s.substring(2);
		int size = target.length();
		int answer = 0;
		int mul = 1;
		for (int i = 0; i < size; i++) {
			char c = target.charAt(size-1-i);
			if (c >= 97 && c <= 102) {
				answer += (c - 87) * mul;
			} else {
				answer += (c - 48) * mul;
			}
			mul *= 16;
		}
		return answer;
	}
}
