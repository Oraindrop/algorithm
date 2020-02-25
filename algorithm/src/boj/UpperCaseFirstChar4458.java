package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperCaseFirstChar4458 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String input = "";
		for (int i = 0; i < n; i++) {
			input = br.readLine();
			char first = input.charAt(0);
			if (isLowerCase(first)) {
				first = (char)((int)'A' + (int)(first - 'a'));
			}
			sb.append(first).append(input.substring(1)).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
	
	static boolean isLowerCase(char c) {
		return (c >= 'a' && c <= 'z');
	}

}
