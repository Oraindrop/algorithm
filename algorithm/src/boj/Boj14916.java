package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14916 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = n / 5;
		int count = 1000000;
		
		for (int i = max; i >= 0; i--) {
			int mult = i * 5;
			int temp = n - mult;
			if (temp % 2 == 0) {
				int tempCount = i + (temp / 2);
				if (tempCount < count) count = tempCount;
			}
		}
		
		System.out.println(count == 1000000 ? -1 : count);
	}

}
