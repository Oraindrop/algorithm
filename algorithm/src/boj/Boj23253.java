package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj23253 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		List<Stack<Integer>> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < m; i++) {
			br.readLine();
			String[] arr = br.readLine().split(" ");
			Stack<Integer> stack = new Stack<>();
			for (String s : arr) {
				stack.add(Integer.parseInt(s));
			}
			map.put(stack.pop(), i);
			list.add(stack);
		}
		
		boolean ok = true;
		for (int i = 1; i <= n; i++) {
			int index = map.getOrDefault(i, -1);
			if (index == -1) {
				ok = false;
				break;
			}
			
			Stack<Integer> stack = list.get(index);
			map.remove(i);

			if (!stack.isEmpty()) {
				map.put(stack.pop(), index);
			}
		}
		
		System.out.println(ok ? "Yes" : "No");
	}

}
