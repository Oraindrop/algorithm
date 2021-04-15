package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj11899 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		for (char c : input.toCharArray()) {
			if (!stack.isEmpty() && (stack.peek() == '(' && c == ')')) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		
		System.out.println(stack.size());

	}

}
