package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj18005 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if (n % 2 == 0) {
			int value = n / 2;
			System.out.println(value % 2 == 0 ? "2" : "1");
		} else {
			System.out.println("0");
		}
	}

}
