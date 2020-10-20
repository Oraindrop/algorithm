package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj20053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			minQ.clear();
			maxQ.clear();
			for (int j = 0; j < n; j++) {
				int value = Integer.parseInt(st.nextToken());
				minQ.offer(value);
				maxQ.offer(value);
			}
			sb.append(minQ.poll()).append(" ").append(maxQ.poll()).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
