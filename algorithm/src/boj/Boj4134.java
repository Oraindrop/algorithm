package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4134 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			long n = Long.parseLong(br.readLine());
			if (n < 3) {
				sb.append(2).append(System.lineSeparator());
			} else {
				while (!isPrime(n)) {
					n++;
				}
				sb.append(n).append(System.lineSeparator());	
			}
		}
		System.out.println(sb.toString());
	}
	
	static boolean isPrime(long num) {
		int size = (int)Math.sqrt(num);
		for (int i = 2; i <= size; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
