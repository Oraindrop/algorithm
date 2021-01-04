package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11653 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while (n != 1) {
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					sb.append(i).append(System.lineSeparator());
					n /= i;
					break;
				}
			}
		}
		
		System.out.print(sb.toString());
	}

}
