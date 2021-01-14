package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3004 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if (n % 2 == 0) {
			System.out.println((n/2 + 1) * (n/2 + 1));
		} else {
			System.out.println((n/2 + 1) * (n/2 + 2));
		}
	}

}
