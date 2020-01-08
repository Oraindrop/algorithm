package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsThisTwoSquared11966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(go(n));
	}
	
	static int go(int n) {
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				return 0;
			}
		}
		return 1;
	}

}
