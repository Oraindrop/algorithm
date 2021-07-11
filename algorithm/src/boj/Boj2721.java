package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2721 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int[] t = new int[302];
		t[1] = 1;
		
		for (int i = 2; i < 302; i++) {
			t[i] = (i * (i+1)) / 2;
		}
		
		long[] w = new long[301];
		
		for (int i = 1; i < 301; i++) {
			long sum = 0;
			for (int j = 1; j <= i; j++) {
				sum += j * t[j+1];
			}
			w[i] = sum;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < test; i++) {
			sb.append(w[Integer.parseInt(br.readLine())]).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
		
	}

}
