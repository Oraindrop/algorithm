package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj3986 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (go(br.readLine())) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	static boolean go(String input) {
		
		Stack<Character> stack = new Stack<>();
		
		for (char c : input.toCharArray()) {
			if (stack.isEmpty()) {
				stack.push(c);
			} else {
				if (c == stack.peek()) {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
		}
		
		return stack.isEmpty();
	}

}
