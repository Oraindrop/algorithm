package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuteOrNotCute10886 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int one = 0;
		int zero = 0;
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			if (k == 1) one ++;
			else zero++;
		}
		
		String s = one > zero ? "cute!" : "not cute!";
		System.out.println("Junhee is " + s);
	}

}
