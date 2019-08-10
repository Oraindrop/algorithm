package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathIsPhysical17362 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = go(n);
		System.out.println(answer);
	}
	
	static int go(int n) {
		if (n <= 5) {
			return n;
		}
		
		int convert = n - 2;
		int value = convert / 4;
		int mod = n % 4;
		
		if (value % 2 == 1) {
			if (mod == 2) return 4;
			if (mod == 0) return 2;
			return mod;
		} 
		
		if (mod == 0) return 4;
		if (mod == 1) return 5;
		return mod;
	}

}
