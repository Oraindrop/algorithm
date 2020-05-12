package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int t = Integer.parseInt(br.readLine());
		Stack<String> lStack = new Stack<>();
		Stack<String> rStack = new Stack<>();
		
		String[] arr = input.split("");
		for (String s : arr) {
			lStack.push(s);
		}
		
		for (int i = 0; i < t; i++) {
			String op = br.readLine();

			if (op.equals("L")) {
				if (!lStack.isEmpty()) {
					rStack.push(lStack.pop());
				}
			} else if (op.equals("D")) {
				if (!rStack.isEmpty()) {
					lStack.push(rStack.pop());
				}
			} else if (op.equals("B")) {
				if (!lStack.isEmpty()) {
					lStack.pop();
				}
			} else {
				lStack.push(op.split(" ")[1]);
			}
			
		}
		
		while (!lStack.isEmpty()) {
			rStack.push(lStack.pop());
		}
		
		StringBuilder sb = new StringBuilder();
		
		while (!rStack.isEmpty()) {
			sb.append(rStack.pop());
		}
		
		System.out.print(sb.toString());
	}


}
