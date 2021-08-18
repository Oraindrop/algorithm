package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9954 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder result = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("#")) {
			sb.setLength(0);
			String target = input.substring(0, input.length() - 1);
			int gap = input.charAt(input.length() - 1) - 'A';
			for (char c : target.toCharArray()) {
				if (c >= 'a' && c <= 'z') {
					char newChar = (char)(c - gap);
					if (newChar < 'a') {
						newChar += 26;
					}
					sb.append(newChar);
				} else if (c >= 'A' && c <= 'Z') {
					char newChar = (char)(c - gap);
					if (newChar < 'A') {
						newChar += 26;
					}
					sb.append(newChar);
				} else {
					sb.append(c);	
				}
			}
			
			result.append(sb.toString()).append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.print(result.toString());
	}

}
