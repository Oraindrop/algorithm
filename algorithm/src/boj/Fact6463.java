package boj;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Fact6463 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger[] arr = new BigInteger[10001];
		StringBuilder sb = new StringBuilder();
		arr[0] = BigInteger.ONE;
		for (int i = 1; i < 10000; i++) {
			int value = i;
			arr[i] = arr[i-1].multiply(BigInteger.valueOf(value));
		}
		
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			sb.append(String.format("%5d -> ", n)).append(notZero(arr[n])).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
		sc.close();
	}
	
	static String notZero(BigInteger i) {
		String s = i.toString();
		for (int j = s.length() - 1; j >= 0; j--) {
			if (s.charAt(j) != '0') {
				return String.valueOf(s.charAt(j));
			}
		}
		return "";
	}

}
