package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedWorld4949 {

	static List<String> pushList = Arrays.asList("(", "[");
	static List<String> popList = Arrays.asList(")", "]");
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while(!input.equals(".")) {
			sb.append(go(input) ? "yes" : "no").append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.print(sb.toString());
	}

	static boolean go(String input) {
		Stack<String> stack = new Stack<>();
		String[] arr = input.split("");
		for (String s : arr) {
			if (pushList.contains(s)) {
				stack.push(s);
			} else if (popList.contains(s)) {
				int index = s.equals(popList.get(0)) ? 0 : 1;
				if (stack.empty()) {
					return false;
				} else if (!stack.pop().equals(pushList.get(index))) {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}
}
