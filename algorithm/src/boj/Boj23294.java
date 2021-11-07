package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj23294 {
	
	static int size = 0;
	static boolean first = true;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Deque<Integer> front = new LinkedList<>();
		Deque<Integer> back = new LinkedList<>();
		
		int curPage = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		int[] sizeArr = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			sizeArr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < q; i++) {
			String input = br.readLine();
			char op = input.charAt(0);
			if (op == 'B') {
				curPage = back(front, back, curPage);
			} else if (op == 'F') {
				curPage = front(front, back, curPage);
			} else if (op == 'C') {
				back = compression(back, sizeArr);
			} else {
				int targetPage = Integer.parseInt(input.split(" ")[1]);
				curPage = access(front, back, curPage, targetPage, sizeArr, max);
			}
//			System.out.println(input + ", curPage : " + curPage + ", back : " + back + ", front : " + front + ", size : " + size);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(curPage).append(System.lineSeparator());
		print(back, sb);
		print(front, sb);
		
		System.out.print(sb.toString());
	}
	
	static int back(Deque<Integer> front, Deque<Integer> back, int curPage) {
		if (back.isEmpty()) {
			return curPage;
		}
		
		front.push(curPage);
		return back.pop();
	}
	
	static int front(Deque<Integer> front, Deque<Integer> back, int curPage) {
		if (front.isEmpty()) {
			return curPage;
		}
		
		back.push(curPage);
		return front.pop();
	}
	
	static int access(Deque<Integer> front, Deque<Integer> back, int curPage, int targetPage, int[] sizeArr, int max) {
		while (!front.isEmpty()) {
			size -= sizeArr[front.pop()];
		}
		
		size += sizeArr[targetPage];
		
		if (!first) {
			back.push(curPage);
		}
		
		first = false;
		
		while (size > max) {
			size -= sizeArr[back.removeLast()];
		}
		
		return targetPage;
	}
	
	static Deque<Integer> compression(Deque<Integer> back, int[] sizeArr) {
		int pre = 0;
		Deque<Integer> newBack = new LinkedList<Integer>();
		
		while (!back.isEmpty()) {
			int cur = back.removeLast();
			if (pre != cur) {
				newBack.push(cur);
				pre = cur;
			} else {
				size -= sizeArr[cur];
			}
		}

		return newBack;
	}
	
	static void print(Deque<Integer> deque, StringBuilder sb) {
		if (deque.isEmpty()) {
			sb.append("-1").append(System.lineSeparator());
			return;
		}
		
		while (!deque.isEmpty()) {
			sb.append(deque.pop()).append(" ");
		}
		
		sb.append(System.lineSeparator());
	}
}
