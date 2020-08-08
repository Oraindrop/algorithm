package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj5636 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		boolean[] bools = new boolean[100001];
		int limit = (int) Math.sqrt(100001) + 1;
		
		for (int i = 2; i < 100001; i++) {
			bools[i] = true;
		}
		
		for (int i = 2; i < limit; i++) {
			if (bools[i]) {
				for (int j = i*i; j < 100001; j+=i) {
					bools[j] = false;
				}
			}
		}
		
		List<Integer> primes = new ArrayList<Integer>();
		
		for (int i = 100000; i >= 2; i--) {
			if (bools[i]) {
				primes.add(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		while(!input.equals("0")) {
			int answer = 0;
			for (int prime : primes) {
				if (input.contains(String.valueOf(prime))) {
					answer = prime;
					break;
				}
			}
			sb.append(answer).append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
