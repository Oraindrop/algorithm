package white.ship.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack2 checkBrackets = new Stack2();
		System.out.println(checkBrackets.check("((())"));
		System.out.println(checkBrackets.check("((()))"));
	}
	
	private boolean check(String expression) {
		List<Character> opening = Arrays.asList('(', '{', '[');
		List<Character> closing = Arrays.asList(')', '}', ']');
		char[] arr = expression.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		
		for (char c : arr) {
			if (opening.contains(c)) {
				stack.push(c);
			} else if (closing.contains(c)) {
				if (stack.isEmpty()) {
					return false;
				}
				
				if (opening.indexOf(stack.pop()) != closing.indexOf(c)) {
					return false;
				}
			}
		}
		
		
		return stack.isEmpty();
	}

}
