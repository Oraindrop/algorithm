package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2523 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}

}
