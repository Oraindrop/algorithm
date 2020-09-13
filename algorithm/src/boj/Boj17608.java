package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj17608 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < n; i++) {
			stack.push(Integer.parseInt(br.readLine()));
		}
		
		int base = stack.pop();
		int count = 1;
		
		while (!stack.empty()) {
			int temp = stack.pop();
			if (temp > base) {
				base = temp;
				count++;
			}
		}
		
		System.out.println(count);
	}

}
