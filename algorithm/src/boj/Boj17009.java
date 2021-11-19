package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj17009 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 0;
		for (int i = 3; i > 0; i--) {
			a += i * Integer.parseInt(br.readLine());
		}
		for (int i = 3; i > 0; i--) {
			b += i * Integer.parseInt(br.readLine());
		}
		
		if (a == b) {
			System.out.println("T");
		} else if (a > b) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}

}
