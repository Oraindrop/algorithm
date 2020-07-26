package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj6588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
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
		
		List<Integer> oddPrimes = new ArrayList<>();
		
		for (int i = 2; i < 1000001; i++) {
			if (i % 2 != 0 && arr[i]) {
				oddPrimes.add(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			int a = 0;
			int b = 0;
			int diff = -1;
			for (int prime : oddPrimes) {
				if (prime >= n) {
					break;
				}
				
				int temp = n - prime;
				if (arr[temp]) {
					int tempDiff = Math.abs(prime - temp);
					if (diff < tempDiff) {
						a = prime;
						b = temp;
						diff = tempDiff;
					}
				}
				
			}
			
			if (diff == -1) {
				sb.append("Goldbach's conjecture is wrong.").append(System.lineSeparator());
			} else {
				sb.append(n).append(" = ").append(a).append(" + ").append(b).append(System.lineSeparator());
			}
			
			n = Integer.parseInt(br.readLine());
		}
		System.out.print(sb.toString());
	}

}
