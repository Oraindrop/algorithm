package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj14241 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		for (int i : list) {
			stack.push(i);
		}
		
		int answer = 0;
		
		while (stack.size() > 1) {
			int a = stack.pop();
			int b = stack.pop();
			stack.push(a+b);
			answer += a*b;
		}
		
		System.out.println(answer);
		
	}

}
