package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Boj15633 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int size = (int)Math.sqrt(n) + 1;
		Set<Integer> set = new HashSet<>();
		for (int i = 1; i < size; i++) {
			if (n % i == 0) {
				set.add(i);
				set.add(n / i);
			}
		}
		
		int sum = 0;
		for (int i : set) {
			sum += i;
		}
		
		sum *= 5;
		System.out.println(sum - 24);
	}

}
