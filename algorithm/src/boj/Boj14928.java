package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14928 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int leng = input.length();
		long mod = 0;
		long op = 20000303;
		for (int i = 0; i < leng; i++) {
			mod = (mod * 10 + (input.charAt(i) - '0')) % op;
		}
		System.out.println(mod);
	}

}
