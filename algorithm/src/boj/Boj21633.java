package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj21633 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double answer = 25 + (n / 100.0);		
		if (answer >= 100.0 && answer <= 2000.0) {
			System.out.println(String.format("%.2f", answer));
		} else if (answer < 100) {
			System.out.println("100.00");
		} else {
			System.out.println("2000.00");
		}
	}

}
