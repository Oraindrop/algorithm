package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Binary10829 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger a = new BigInteger(br.readLine());
		BigInteger two = new BigInteger("2");
		StringBuilder sb = new StringBuilder();
		while(!a.equals(BigInteger.ZERO)) {
			sb.append(a.mod(two));
			a = a.divide(two);
		}
		System.out.println(sb.reverse());
	}

}
