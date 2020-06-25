package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj8320 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 1; i < n; i++) {
			
			for (int j = i; j <= n; j++) {
				if (i*j > n) {
					continue;
				} else {
					count++;
				}
			}
			
		}
		
		System.out.println(count == 0 ? 1 : count);
	}

}
