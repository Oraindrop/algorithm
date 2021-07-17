package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Boj1837 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger p = new BigInteger(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		go(p, k);
	}
	
	static void go(BigInteger p, int k) {
		BigInteger zero = BigInteger.ZERO;
		
		for (long i = 2; i < k; i++) {
			
			if (p.mod(BigInteger.valueOf(i)).compareTo(zero) == 0) {
				System.out.println("BAD " + i);
				return;
			}
		}
		
		System.out.println("GOOD");
	}

}
