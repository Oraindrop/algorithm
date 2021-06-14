package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj21734 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : arr) {
			int number = (int) c;
			int answer = 0;
			while (number > 0) {
				answer += number % 10;
				number /= 10;
			}
			for (int i = 0; i < answer; i++) {
				sb.append(c);
			}
			sb.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
