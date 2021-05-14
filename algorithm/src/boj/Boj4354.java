package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4354 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals(".")) {
			sb.append(go(input)).append(System.lineSeparator());
			input = br.readLine();
		}
			
		System.out.print(sb.toString());
	}
	
	static int go(String input) {
		int size = input.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < size; i++) {
			if (size % i == 0) {
				sb.setLength(0);
				String part = input.substring(0, i);
				for (int j = 0; j < size / i; j++) {
					sb.append(part);
				}
				if (sb.toString().equals(input)) {
					return size / i;
				}
			}
			
		}
		
		return 1;
	}

}
