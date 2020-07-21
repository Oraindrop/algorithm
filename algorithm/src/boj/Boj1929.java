package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj1929 {

	static int MAX = 1000001;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[MAX];
		
		for (int i = 2; i < MAX; i++) {
			arr[i] = true;
		}
		
		for (int i = 2; i <= 1000; i++) {
			for (int j = i*i; j < MAX; j += i) {
				arr[j] = false;
			}
		}
		
		List<Integer> primes = new ArrayList<>();
		
		for (int i = 2; i < MAX; i++) {
			if (arr[i]) primes.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int prime : primes) {
			if (prime >= a && prime <= b) {
				sb.append(prime).append(System.lineSeparator());
			}
			
			if (prime > b) {
				break;
			}
		}
		
		System.out.println(sb.toString());
	}

}
