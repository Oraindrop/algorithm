package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Carry4388 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(!input.equals("0 0")) {
			st = new StringTokenizer(input);
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			sb.append(go(a, b)).append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.println(sb.toString());
	}
	
	static long go(long a, long b) {
		long count = 0;
		long carry = 0;
		
		while (a != 0 || b != 0) {
			long modA = a % 10;
			long modB = b % 10;
			if ((modA + modB + carry) >= 10) {
				carry = 1;
				count++;
			} else {
				carry = 0;
			}
			a /= 10;
			b /= 10;
		}
		
		return count;
	}
}
