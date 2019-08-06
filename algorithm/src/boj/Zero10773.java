package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				stack.pop();
			} else {
				stack.push(n);
			}
		}
		
		int sum = 0;
		
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		
		System.out.println(sum);
	}

}
