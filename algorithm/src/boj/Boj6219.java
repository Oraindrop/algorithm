package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj6219 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		String d = st.nextToken();
		
		boolean[] arr = new boolean[b+1];
		int limit = (int)Math.sqrt(b) + 1;
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = true;
		}
		
		for (int i = 2; i < limit; i++) {
			if (arr[i]) {
				for (int j = i*i; j < arr.length; j+=i) {
					arr[j] = false;
				}
			}
		}
		
		List<Integer> primes = new ArrayList<Integer>();
		for (int i = a; i <= b; i++) {
			if (arr[i]) primes.add(i);
		}
		
		int answer = 0;
		
		for (int prime : primes) {
			if (String.valueOf(prime).contains(d)) answer++;
		}
		
		System.out.println(answer);
		
	}

}
