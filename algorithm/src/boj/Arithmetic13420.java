package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Arithmetic13420 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			String op = st.nextToken();
			long b = Long.parseLong(st.nextToken());
			st.nextToken();
			long answer = Long.parseLong(st.nextToken());
			sb.append(go(a, b, op, answer)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static String go(long a, long b, String op, long answer) {
		
		long real = 0; 
		
		if (op.equals("+")) {
			real = a + b;
		} else if (op.equals("-")) {
			real = a - b;
		} else if (op.equals("*")) {
			real = a * b;
		} else if (op.equals("/")) {
			real = a / b;
		}
		
		return real == answer ? "correct" : "wrong answer";
	}

}
