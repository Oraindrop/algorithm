package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15897 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long loop = n % 2 == 0 ? n / 2 : (n / 2) + 1;
		long answer = 0;
		for (int i = 1; i < loop; i++) {
			answer += (n-1)/i + 1;
		}
		
		answer += 2 * (n/2);
		answer += 1;
		
		System.out.println(answer);
	}

}
