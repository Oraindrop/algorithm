package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rounds2033 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
		int temp = n;
		for (int i = 1; i < input.length(); i++) {
			int mod = temp % 10;
			if (mod < 5) {
				n -= mod * Math.pow(10, i-1);				
			} else {
				n += (10 - mod) * Math.pow(10, i-1);
			}
			temp = n;
			temp /= Math.pow(10, i);
		}
		
		System.out.println(n);
	}

}
