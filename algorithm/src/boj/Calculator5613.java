package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator5613 {
	
	static int answer = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String op = br.readLine();
		int b = Integer.parseInt(br.readLine());
		go(a, b, op);
		op = br.readLine();
		while (!op.equals("=")) {
			int temp = answer;
			int n = Integer.parseInt(br.readLine());
			go(temp, n, op);
			op = br.readLine();
		}
		System.out.println(answer);
	}

	static void go(int a, int b, String op) {
		if (op.equals("+")) {
			answer = a + b;
		} else if (op.equals("-")) {
			answer = a - b;
		} else if (op.equals("/")) {
			answer = a / b;
		} else if (op.equals("*")) {
			answer = a * b;
		}
	}
}
