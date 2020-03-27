package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Words4072 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while(!input.equals("#")) {
			String[] arr = input.split(" ");
			for (String s : arr) {
				sb.append(reverse(s)).append(" ");
			}
			sb.append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.println(sb.toString());
	}

	static String reverse(String s) {
		String answer = "";
		char[] arr = s.toCharArray();
		
		for (int i = arr.length - 1; i >= 0; i--) {
			answer += arr[i];
		}
		
		return answer;
	}
}
