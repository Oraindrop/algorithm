package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj20673 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		if (n <= 50 && m <= 10) {
			System.out.println("White");
		} else if (m > 30) {
			System.out.println("Red");
		} else {
			System.out.println("Yellow");
		}
	}

}
