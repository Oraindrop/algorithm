package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlyThree17288 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int count = 0;
		for (int i = 0; i <= input.length() - 3; i++) {
			String str = input.substring(i, i+3);
			if (isSequence(str)) {
				if (i > 0 && i+3 < input.length()) {
					int a = Integer.parseInt(input.substring(i-1, i));
					int b = Integer.parseInt(input.substring(i, i+1));
					int c = Integer.parseInt(input.substring(i+2, i+3));
					int d = Integer.parseInt(input.substring(i+3, i+4));
					if (!isSequence(a, b) && !isSequence(c, d)) {
						count++;
					}
				} else {
					if (i == 0) {
						int a = Integer.parseInt(input.substring(i+2, i+3));
						int b = Integer.parseInt(input.substring(i+3, i+4));
						if (!isSequence(a, b)) {
							count ++;
						}
					} else {
						int a = Integer.parseInt(input.substring(i-1, i));
						int b = Integer.parseInt(input.substring(i, i+1));
						if (!isSequence(a, b)) {
							count ++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
	
	static boolean isSequence(String str) {
		int a = Integer.parseInt(str.substring(0, 1));
		int b = Integer.parseInt(str.substring(1, 2));
		int c = Integer.parseInt(str.substring(2, 3));
		
		return a+1 == b && b+1 == c;
	}
	
	static boolean isSequence(int a, int b) {
		return a+1 == b;
	}

}
