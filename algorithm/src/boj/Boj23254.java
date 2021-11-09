package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj23254 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] arr1 = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");
		
		PriorityQueue<Test> queue = new PriorityQueue<Boj23254.Test>(Collections.reverseOrder());
		
		for (int i = 0; i < m; i++) {
			queue.add(new Test(Integer.parseInt(arr1[i]), Integer.parseInt(arr2[i])));
		}
		
		int max = 24 * n;
		int total = 0;
		
		for (int i = 0; i < m; i++) {
			total += Integer.parseInt(arr1[i]);
		}
		
		
		while (max > 0 && !queue.isEmpty()) {
			Test test = queue.poll();
			int more = 100 - test.getScore();
			
			if (more == 0) {
				continue;
			}
			int duration = more / test.getPlus();
			
			if (max - duration < 0) {
				duration = max;
			}
			
			int getScore = duration * test.getPlus(); 
			max -= duration;
			total += getScore;

			if (getScore != 100) {
				queue.add(new Test(test.getScore() + getScore, 100-(test.getScore() + getScore)));
			}
		}
		
		System.out.println(total);
		
	}
	
	static class Test implements Comparable<Test>{
		private int score;
		private int plus;
		
		public Test(int score, int plus) {
			this.score = score;
			this.plus = plus;
		}
		
		public int getScore() {
			return score;
		}

		public int getPlus() {
			return plus;
		}

		@Override
		public String toString() {
			return "Test [score=" + score + ", plus=" + plus + "]";
		}

		@Override
		public int compareTo(Test o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.plus, o.plus);
		}
	}

}
