package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj1527 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		Queue<Long> q = new LinkedList<>();
		q.add(4l);
		q.add(7l);
		long answer = 0;
		while (!q.isEmpty()) {
			long value = q.poll();
			
			if (value < a) {
				q.add((value * 10l) + 4l);
				q.add((value * 10l) + 7l);
			} else if (value <= b && value <= 1000000000) {
				answer++;
				q.add((value * 10l) + 4l);
				q.add((value * 10l) + 7l);
			}
		}
		
		System.out.println(answer);
	}

}
