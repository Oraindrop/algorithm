package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj3896 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[1299710];
		
		for (int i = 2; i < Math.sqrt(arr.length) + 1; i++) {
			if (!arr[i]) {
				for (int j = i*i; j < arr.length; j += i) {
					arr[j] = true; 
				}	
			}
		}
		
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i < arr.length; i++) {
			if (!arr[i]) {
				primes.add(i);
			}
		}
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(go(n, primes));
		}
	}
	
	static int go(int n, List<Integer> primes) {
		if (n <= 2) {
			return 0;
		}
		
		for (int i = 1; i < primes.size(); i++) {
			if (primes.get(i) > n) {
				return primes.get(i) - primes.get(i-1);
			} else if (primes.get(i) == n) {
				return 0;
			}
		}
		
		return 0;
	}

}
