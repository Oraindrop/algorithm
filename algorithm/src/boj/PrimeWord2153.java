package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeWord2153 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int size = s.length() * 52;
		
		List<Integer> primes = new ArrayList<>();
		primes.add(1);
		for (int i = 2; i <= size; i++) {
			int hit = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) hit++;
			}
			if (hit == 2) primes.add(i);
		}

		int sum = 0;
		
		for (char c : s.toCharArray()) {
			int cInt = (int) c;
			if (cInt >= 97 && cInt <= 122) {
				sum += cInt - 96;
			} else {
				sum += cInt - 38;
			}
		}
		
		if (primes.contains(sum)) {
			System.out.println("It is a prime word.");
		} else {
			System.out.println("It is not a prime word.");
		}
	}

}
