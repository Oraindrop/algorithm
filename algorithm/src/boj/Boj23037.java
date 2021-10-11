package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj23037 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long sum = 0;
		
		while (n > 0) {
			int a = n % 10;
			n /= 10;
			sum += Math.pow(a, 5);
		}
		
		System.out.println(sum);
	}

}
