package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj14915 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(n == 0 ? "0" : go(n, b));
	}
	
	static String go(int n, int b) {
		Stack<String> stack = new Stack<>();
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < 16; i++) {
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

		return sb.toString();
	}

}
