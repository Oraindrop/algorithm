package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj17103 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[1000001];
		
		for (int i = 2; i < 1000001; i++) {
			arr[i] = true;
		}
		
		for (int i = 2; i < 1001; i++) {
			if (arr[i]) {
				for (int j = i*i; j < 1000001; j += i) {
					arr[j] = false;
				}
			}
		}
		
		List<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i < 1000001; i++) {
			if (arr[i]) {
				primes.add(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			for (int prime : primes) {
				if (prime >= n) {
					break;
				}
				int temp = n - prime;
				if (arr[temp]) {
					count++;
					if (temp == prime) {
						count++;
					}
				}
			}
			sb.append(count/2).append(System.lineSeparator());
		}

		System.out.println(sb.toString());
	}


}
