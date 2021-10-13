package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1343 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(go(input));
	}
	
	static String go(String input) {
		StringBuilder sb = new StringBuilder();
		
		int count = 0;
		char[] arr = input.toCharArray();
		for (char c : arr) {
			if (c == '.') {
				if (count > 0) {
					if (count % 2 != 0) {
						return "-1";
					} else {
						while (count > 0) {
							if (count >= 4) {
								sb.append("AAAA");
								count -= 4;
							} else {
								sb.append("BB");
								count -= 2;
							}
						}
					}
				}
				sb.append(".");
			} else {
				count++;
			}
		}
		
		if (count % 2 != 0) {
			return "-1";
		}
		
		while (count > 0) {
			if (count >= 4) {
				sb.append("AAAA");
				count -= 4;
			} else {
				sb.append("BB");
				count -= 2;
			}
		}
		
		return sb.toString();
	}

}
