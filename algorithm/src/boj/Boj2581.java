package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[10001];
		
		for (int i = 2; i < 10001; i++) {
			arr[i] = true;
		}
		
		for (int i = 2; i <= 100; i++) {
			for (int j = i*i; j < 10001; j += i) {
				arr[j] = false;
			}
		}
		
		List<Integer> primes = new ArrayList<Integer>();
		
		for (int i = 2; i < 10001; i++) {
			if (arr[i]) primes.add(i);
		}
		
		List<Integer> answers = new ArrayList<Integer>();
		
		long sum = 0;
		for (int i : primes) {
			if (i >= m && i <= n) {
				sum += i;
				answers.add(i);
			}
		}
		
		if (sum != 0) {
			System.out.println(sum);
			System.out.println(answers.get(0));	
		} else {
			System.out.println(-1);
		}
		
	}

}
