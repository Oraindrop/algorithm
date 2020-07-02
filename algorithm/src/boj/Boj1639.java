package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1639 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		if (input.length() < 2) {
			System.out.println("0");
		} else if (input.length() % 2 == 0) {
			int answer = getLuckyLength(input);
			System.out.println(answer);
		} else {
			int answer = Math.max(getLuckyLength(input.substring(0, input.length() - 1)), getLuckyLength(input.substring(1, input.length())));
			System.out.println(answer);
		}
	}
	
	static int getLuckyLength(String input) {
		int length = input.length() / 2;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < (2 * i) + 1; j++) {
				int temp = j + length - i;
				String s1 = input.substring(j, temp);
				String s2 = input.substring(j+length-i, temp + length - i);
				if (sum(s1) == sum(s2)) {
					return (length - i) * 2;
				}
			}
		}
		return 0;
	}

	static int sum(String s) {
		char[] arr = s.toCharArray();
		int sum = 0;
		for (char c : arr) {
			sum += c - '0';
		}
		return sum;
	}
}
