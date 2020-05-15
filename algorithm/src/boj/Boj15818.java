package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Boj15818 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		BigInteger sum = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			sum = sum.multiply(BigInteger.valueOf(Long.parseLong(st.nextToken()) % m));
		}
		
		System.out.println(sum.mod(BigInteger.valueOf(m)));
	}

}
