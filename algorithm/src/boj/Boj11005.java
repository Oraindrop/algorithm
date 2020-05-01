package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj11005 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, String> map = new HashMap<>();
		Stack<String> stack = new Stack<>();
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < 36; i++) {
			map.put(i, i < 10 ? String.valueOf(i) : String.valueOf((char)((int)'A' + i - 10)));
		}
		while (n > 0) {
			int mod = n % b;
			n /= b;
			stack.push(map.get(mod));
		}
		
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb.toString());
	}

}
