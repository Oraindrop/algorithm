package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Boj2061 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger key = new BigInteger(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int answer = 0;
		for (int i = 2; i < l; i++) {
			if (key.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
				answer = i;
				break;
			}
		}
		
		if (answer == 0) {
			System.out.println("GOOD");
		} else {
			System.out.println("BAD " + answer);
		}
	}

}
