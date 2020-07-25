package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj9020 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[10001];
		for (int i = 2; i < 10001; i++) {
			arr[i] = true;
		}
		
		for (int i = 2; i < 101; i++) {
			if (arr[i]) {
				for (int j = i*i; j < 10001; j += i) {
					arr[j] = false;
				}
			}
		}
		
		List<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i < 10001; i++) {
			if (arr[i])
				primes.add(i);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int a = 0;
			int b = 0;
			int diff = 10001;
			for (int prime : primes) {
				if (prime >= n) {
					break;
				}
				int temp = n - prime;
				if (arr[temp]) {
					int tempDiff = Math.abs(prime - temp);
					if (diff > tempDiff) {
						a = prime;
						b = temp;
						diff = tempDiff;
					}
				}
			}
			sb.append(a).append(" ").append(b).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
