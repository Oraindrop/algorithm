package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Boj1927 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(br.readLine());
			if (value == 0) {
				sb.append(pq.isEmpty() ? 0 : pq.poll()).append(System.lineSeparator()); 
			} else {
				pq.offer(value);
			}
		}
		System.out.print(sb.toString());
	}

}
