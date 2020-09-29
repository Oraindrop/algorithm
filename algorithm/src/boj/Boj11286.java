package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Boj11286 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (Math.abs(o1) < Math.abs(o2)) 
					return -1;
				if (Math.abs(o1) > Math.abs(o2))
					return 1;
				if (o1 < o2)
					return -1;
				if (o2 < o1)
					return 1;
				return 0;
			}
		});
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
