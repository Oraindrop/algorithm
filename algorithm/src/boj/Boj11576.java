package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj11576 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		Stack<Long> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			stack.push(Long.parseLong(st.nextToken()));
		}
		
		long multi = 1;
		long value = 0;
		while (!stack.isEmpty()) {
			value += multi * stack.pop();
			multi *= a;
		}
		
		while (value > 0) {
			stack.push(value % b);
			value /= b;
		}
		
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop()).append(" ");
		}
		
		System.out.println(sb.toString());
	}

}
