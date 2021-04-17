package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj6438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			sb.append(reverse(br.readLine())).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		char[] arr = s.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}

}
