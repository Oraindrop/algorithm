package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tardy10419 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(go(n)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static int go(int n) {
		int temp = 0;
		
		for (int i = 1; i < 101; i++) {
			temp = i + (i*i);
			if (temp > n) {
				return i-1;
			}
		}
		
		return 0;
	}

}
