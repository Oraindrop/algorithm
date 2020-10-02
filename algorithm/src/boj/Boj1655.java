package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Boj1655 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> rightQ = new PriorityQueue<Integer>();
		PriorityQueue<Integer> leftQ = new PriorityQueue<Integer>(Collections.reverseOrder());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int mid = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append(mid).append(System.lineSeparator());
		for (int i = 0; i < t-1; i++) {
			int value = Integer.parseInt(br.readLine());
			if (value > mid) {
				rightQ.offer(value);
				if (rightQ.size() > leftQ.size() + 1) {
					leftQ.offer(mid);
					mid = rightQ.poll();
				}
			} else {
				leftQ.offer(value);
				if (leftQ.size() > rightQ.size()) {
					rightQ.offer(mid);
					mid = leftQ.poll();
				}
			}
			sb.append(mid).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
