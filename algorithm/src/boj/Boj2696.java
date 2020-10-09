package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj2696 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> leftQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> rightQ = new PriorityQueue<Integer>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			leftQ.clear();
			rightQ.clear();
			int m = Integer.parseInt(br.readLine());
			int count = 0;
			int mid = 0;
			sb.append((m/2) + 1);
			for (int j = 0; j <= (m-1) / 10; j++) {
				st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					if ((count+1) % 20 == 1) {
						sb.append(System.lineSeparator());
					}
					if (count == 0) {
						mid = Integer.parseInt(st.nextToken());
					} else {
						int value = Integer.parseInt(st.nextToken());
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
					}
					if (count % 2 == 0) {
						sb.append(mid).append(" ");
					}
					count++;
				}
			}
			sb.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
