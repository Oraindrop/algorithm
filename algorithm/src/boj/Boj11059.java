package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11059 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int maxSize = input.length() % 2 == 0 ? input.length() : input.length() - 1;
		int size = maxSize;
		int answer = 0;
		while (answer == 0) {
			int i = 0;
			while (i + size <= input.length()) {
				if (isRight(input.substring(i, size+i))) {
					answer = size;
					break;
				}
				i++;
			}
			size-=2;
		}
		System.out.println(answer);
	}
	
	static boolean isRight(String s) {
		String pre = s.substring(0, s.length() / 2);
		String post = s.substring(s.length() / 2);
		return sum(pre) == sum(post);
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
