package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15667 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(go(n-1));
	}
	
	static int go(int n) {
		for (int i = 1; i < n; i++) {
			if ( (i * (i+1)) == n ) {
				return i;
			}
		}
		return 0;
	}

}
