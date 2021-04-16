package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Boj14713 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Stack<String>> stackList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Stack<String> stack = new Stack<>();
			for (String s : br.readLine().split(" ")) {
				stack.push(s);
			}
			stackList.add(stack);
		}
		
		Stack<String> stack = new Stack<String>();
		for (String s : br.readLine().split(" ")) {
			stack.push(s);
		}
		
		boolean flag = true;
		while (!stack.isEmpty()) {
			if (!go(stackList, stack.pop())) {
				flag = false;
				break;
			}
		}
		
		if (!flag) {
			System.out.println("Impossible");
		} else {
			for (Stack<String> s : stackList) {
				flag &= s.isEmpty();
			}
			
			System.out.println(flag ? "Possible" : "Impossible");
		}
	}

	static boolean go(List<Stack<String>> stackList, String value) {
		for (Stack<String> s : stackList) {
			if (!s.isEmpty() && s.peek().equals(value)) {
				s.pop();
				return true;
			}
		}
		return false;
	}
}
