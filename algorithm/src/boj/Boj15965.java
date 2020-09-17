package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj15965 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int max = 7500000;
		boolean[] arr = new boolean[max];
		int size = (int) Math.sqrt(max) + 1;
		for (int i = 2; i < size; i++) {
			if (!arr[i]) {
				for (int j = i*i; j < max; j+=i) {
					arr[j] = true;
				}
			}
		}
		
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i < max; i++) {
			if (!arr[i]) {
				primes.add(i);
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()) - 1;
		System.out.println(primes.get(n));
	}

}
