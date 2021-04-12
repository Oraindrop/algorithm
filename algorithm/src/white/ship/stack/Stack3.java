package white.ship.stack;

import java.util.Stack;

public class Stack3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack3 stackProblem = new Stack3();
		System.out.println(stackProblem.calculate("123+-"));
		System.out.println(stackProblem.calculate("63/"));
		System.out.println(stackProblem.calculate("521+-9*"));
	}
	
	private int calculate(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				stack.push(c - '0');
			} else {
				if (c == '+') {
					int right = stack.pop();
					int left = stack.pop();
					stack.push(left+right);
				} else if (c == '-') {
					int right = stack.pop();
					int left = stack.pop();
					stack.push(left-right);
				} else if (c == '*') {
					int right = stack.pop();
					int left = stack.pop();
					stack.push(left*right);
				} else if (c == '/') {
					int right = stack.pop();
					int left = stack.pop();
					stack.push(left/right);
				}
			}
		}
		
		return stack.pop();
	}

}
