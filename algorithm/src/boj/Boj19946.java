package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj19946 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger two = BigInteger.valueOf(2l);
		
		BigInteger input = new BigInteger(br.readLine());
		
		for (int i = 64; i >= 1; i--) {
			if (input.mod(two).equals(BigInteger.ONE)) {
				System.out.println(i);
				break;
			} else {
				input = input.divide(two);
			}
		}
		
	}

}
