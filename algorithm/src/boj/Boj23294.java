package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj23294 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < n+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Deque<Integer> back = new LinkedList<>();
		Stack<Integer> front = new Stack<>();
		int size = 0;
		int curPage = 0;
		boolean first = true;
		
		for (int i = 0; i < q; i++) {
			String input = br.readLine();
			System.out.println("input : " + input + ", size : " + size + ", cur : " + curPage + ", front : " + front + ", back : " + back);
			char op = input.charAt(0);
			if (op == 'A') {
				int page = Integer.parseInt(input.split(" ")[1]);
				while (!front.isEmpty()) {
					int frontPage = front.pop();
					size -= arr[frontPage];
				}
				
				if (!first) {
					back.addFirst(curPage);
					size += arr[curPage];
				}

				curPage = page;
				size += arr[page];
				
				while (size > c) {
					int backPage = back.removeLast();
					size -= arr[backPage];
				}
				
				first = false;
				
			} else if (op == 'C') {
				int pre = 0;
				Deque<Integer> newList = new LinkedList<Integer>();
				
				for (int number : back) {
					if (pre != number) {
						newList.addFirst(number);
						pre = number;
					} else {
						size -= arr[number];
					}
				}
				
				back = newList;
			} else if (op == 'B') {
				if (!back.isEmpty()) {
					front.add(curPage);
					curPage = back.removeFirst();
				}
			} else if (op == 'F') {
				if (!front.isEmpty()) {
					back.add(curPage);
					curPage = front.pop();
				}
			}
		}
		
	}

}
