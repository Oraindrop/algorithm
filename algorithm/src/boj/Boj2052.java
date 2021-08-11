package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj2052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger number = BigInteger.valueOf(5);
		for (int i = 1; i < n; i++) {
			number = number.multiply(BigInteger.valueOf(5));
		}
		
		int length = number.toString().length();
		int numberOfZero = n+1 - length;
		StringBuilder sb = new StringBuilder();
		sb.append("0.");
		for (int i = 1; i < numberOfZero; i++) {
			sb.append("0");
		}
		
		sb.append(number.toString());
		System.out.println(sb.toString());
	}

}
