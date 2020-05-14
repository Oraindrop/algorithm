package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String op = "";
		CustomQueue q = new CustomQueue();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			op = st.nextToken();
			if (op.equals("push")) {
				q.push(Integer.parseInt(st.nextToken()));
			} else if (op.equals("pop")) {
				sb.append(q.pop()).append(System.lineSeparator());
			} else if (op.equals("size")) {
				sb.append(q.size()).append(System.lineSeparator());
			} else if (op.equals("empty")) {
				sb.append(q.empty()).append(System.lineSeparator());
			} else if (op.equals("front")) {
				sb.append(q.front()).append(System.lineSeparator());
			} else if (op.equals("back")) {
				sb.append(q.back()).append(System.lineSeparator());
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
}

class CustomQueue {
	
	private Deque<Integer> q;
	
	private int size;

	public CustomQueue() {
		this.q = new LinkedList<>();
		this.size = 0;
	}
	
	public void push(int i) {
		this.q.add(i);
		this.size++;
	}
	
	public int pop() {
		if (size == 0) {
			return -1;
		}
		
		this.size--;
		return this.q.poll();
	}
	
	public int size() {
		return this.size;
	}
	
	public int empty() {
		return this.size == 0 ? 1 : 0;
	}
	
	public int front() {
		if (this.size == 0) {
			return -1;
		}
		
		return this.q.peek();
	}
	
	public int back() {
		if (this.size == 0) {
			return -1;
		}
		
		return this.q.peekLast();
	}

}
