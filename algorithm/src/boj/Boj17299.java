package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj17299 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(st.nextToken()); 
			arr[i] = input;
			if (map.containsKey(input)) {
				map.put(input, map.get(input) + 1);
			} else {
				map.put(input, 1);
			}
		}
		
		int[] answers = new int[n];
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && map.get(arr[i]) > map.get(arr[stack.peek()])) {
				answers[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		
		while (!stack.isEmpty()) {
			answers[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i : answers) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb.toString());
	}

}
