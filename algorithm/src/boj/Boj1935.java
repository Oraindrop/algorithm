package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Boj1935 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Double> stack = new Stack<>();
		List<Character> operators = Arrays.asList('+', '-', '*', '/');
		for (char c : input.toCharArray()) {
			if (operators.contains(c)) {
				double right = stack.pop();
				double left = stack.pop();
				if (c == '+') {
					stack.push(left+right);
				} else if (c == '-') {
					stack.push(left-right);
				} else if (c == '*') {
					stack.push(left*right);
				} else if (c == '/') {
					stack.push(left/right);
				}
			} else {
				stack.push((double) arr[c - 'A']);
			}
		}
		
		System.out.println(String.format("%.2f", stack.pop()));
	}

}
