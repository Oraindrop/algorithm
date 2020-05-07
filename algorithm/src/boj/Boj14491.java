package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj14491 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
		Stack<String> stack = new Stack<>();

		while (n > 0) {
			int mod = n % 9;
			n /= 9;
			stack.push(String.valueOf(mod));
		}
		
		StringBuilder sb = new StringBuilder();
		
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb.toString());
	}

}
