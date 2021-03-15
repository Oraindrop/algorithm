package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj13699 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger[] arr = new BigInteger[36];
		arr[0] = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			BigInteger sum = BigInteger.ZERO;
			for (int j = 0; j < i; j++) {
				sum = sum.add(arr[j].multiply(arr[i-1-j]));
			}
			arr[i] = sum;
		}
		
		System.out.println(arr[n]);
	}

}
