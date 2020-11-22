package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11575 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String[] sArr = br.readLine().split(" ");
			int a = Integer.parseInt(sArr[0]);
			int b = Integer.parseInt(sArr[1]);
			char[] arr = br.readLine().toCharArray();
			
			for (int j = 0; j < arr.length; j++) {
				sb.append(cipher(a, b, arr[j]));
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static char cipher(int a, int b, char c) {
		int cValue = (int)(c - 'A');
		return (char)((((a * cValue) + b) % 26) + 'A');
	}

}
