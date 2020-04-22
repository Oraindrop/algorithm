package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Boj15815 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Long> stack = new Stack<>();
		Set<String> set = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
		
		String[] input = br.readLine().split("");
		for (int i = 0; i < input.length; i++) {
			String value = input[i];
			if (set.contains(value)) {
				long b = stack.pop();
				long a = stack.pop();
				stack.add(calc(a, b, value));
			} else {
				stack.add(Long.parseLong(value));
			}
		}
		
		System.out.println(stack.pop());
	}

	static long calc(long a, long b, String op) {
		if (op.equals("+")) {
			return a + b;
		} else if (op.equals("-")) {
			return a - b;
		} else if (op.equals("*")) {
			return a * b;
		} else {
			return a / b;
		}
	}
}
