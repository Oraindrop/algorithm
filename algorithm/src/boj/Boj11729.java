package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Boj11729 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger bg = BigInteger.ONE;
		for(int i = 0; i < n; i++) {
			bg = bg.multiply(BigInteger.valueOf(2));
		}
		bg = bg.subtract(BigInteger.ONE);
		StringBuilder sb = new StringBuilder();
		sb.append(bg.toString()).append(System.lineSeparator());
		hanoi(1, 2, 3, n, sb);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
	public static void hanoi(int from, int by, int to, int n, StringBuilder sb) {
		if(n == 1) {
			sb.append(from).append(" ").append(to).append(System.lineSeparator());
			return;
		}
		hanoi(from, to, by, n-1, sb);
		sb.append(from).append(" ").append(to).append(System.lineSeparator());
		hanoi(by, from, to, n-1, sb);		
	}
}
