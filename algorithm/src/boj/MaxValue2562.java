package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxValue2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int maxIndex = 0;
		for (int i = 1; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n > max) {
				max = n;
				maxIndex = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxIndex);
	}

}
