package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFlip3062 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			System.out.println(go(br.readLine()));
		}
	}
	
	private static String go(String input) {
		
		int n = Integer.parseInt(input);
		int r = Integer.parseInt(new StringBuilder(input).reverse().toString());
		
		int sum = n + r;
		if (sum == Integer.parseInt(new StringBuilder(String.valueOf(sum)).reverse().toString())) {
			return "YES";
		}
		return "NO";
	}

}
