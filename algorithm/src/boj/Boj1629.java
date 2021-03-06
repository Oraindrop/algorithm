package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1629 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());
		
		System.out.println(power(a, b, c));
	}

	static long power(long a, long b, long c) {
		if (b == 0) {
			return 1;
		}
		
		if (b == 1) {
			return a % c;
		}
		
		long p = power(a, b/2, c);
		
		if (b % 2 == 1) {
			return p * p % c * a % c;
		} else {
			return p * p % c;
		}
	}
}
