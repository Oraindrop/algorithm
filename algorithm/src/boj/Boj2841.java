package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj2841 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st.nextToken();
		List<Stack<Integer>> list = Arrays.asList(new Stack<>(), new Stack<>(), new Stack<>(), new Stack<>(), new Stack<>(), new Stack<>());
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int line = Integer.parseInt(st.nextToken()) - 1;
			int p = Integer.parseInt(st.nextToken());
			if (list.get(line).isEmpty()) {
				count++;
				list.get(line).push(p);
			} else {
				int top = list.get(line).peek();
				if (p > top) {
					count++;
					list.get(line).push(p);
				} else if (p < top) {
					while (p < top && !list.get(line).isEmpty()) {
						list.get(line).pop();
						if (!list.get(line).isEmpty()) {
							top = list.get(line).peek();	
						}
						count++;
					}
					if (p != top) {
						list.get(line).push(p);
						count++;	
					}
				}
			}
		}
		
		System.out.println(count);
	}

}

