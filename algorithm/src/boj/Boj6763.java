package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj6763 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		long b = Long.parseLong(br.readLine());
		
		if (a >= b) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else {
			long diff = b-a;
			int answer = 100;
			if (diff >= 31) {
				answer = 500;
			} else if (diff >= 21) {
				answer = 270;
			}
			System.out.println(String.format("You are speeding and your fine is $%d.", answer));
		}
	}

}
