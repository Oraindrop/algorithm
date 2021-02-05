package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj12789 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int index = 1;
		boolean result = true;
		for (int i = 0; i < n; i++) {
			int value = list.get(i);
			if (value == index) {
				index++;
			} else {
				if (!stack.isEmpty() && stack.peek() == index) {
					stack.pop();
					index++;
					i--;
				} else {
					stack.push(value);
				}
			}
		}
		
		while (!stack.isEmpty()) {
			if (stack.pop() == index) {
				index++;
			} else {
				result = false;
				break;
			}
		}
		
		System.out.println(result ? "Nice" : "Sad");
	}

}
