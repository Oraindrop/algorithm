package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollatzConjecture3943 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			long n = Long.parseLong(br.readLine());
			long max = n;
			
			while (n != 1) {
				if (n % 2 == 0) {
					n /= 2;
				} else {
					n *= 3;
					n += 1;
				}
				
				if (n > max) {
					max = n;
				}
			}
			
			sb.append(max).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
}
