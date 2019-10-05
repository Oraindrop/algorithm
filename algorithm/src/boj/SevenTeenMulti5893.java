package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SevenTeenMulti5893 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String a = s + "0000";
		System.out.println(go(a, s));
	}
	
	static String go(String a, String s) {
		String b = "0000" + s;
		int size = a.length();
		Stack<String> stack = new Stack<>();
		int carry = 0;
		for (int i = 0; i < size; i++) {
			int first = Integer.parseInt(a.substring(size - 1 - i, size - i));
			int second = Integer.parseInt(b.substring(size - 1 - i, size - i));
			int sum = (first + second + carry) % 2;
			carry = (first + second + carry) / 2;
			stack.push(String.valueOf(sum));
		}
		
		if (carry != 0) {
			stack.push("1");
		}
		
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			String candidate = stack.pop();
			if (sb.length() == 0 && candidate.equals("0")) {
				// skip
			} else {
				sb.append(candidate);
			}
		}
		
		return sb.length() == 0 ? "0" : sb.toString();
	}

}
