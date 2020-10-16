package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj14593 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Ajou> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			list.add(new Ajou(i, br.readLine()));
		}
		
		Collections.sort(list);
		System.out.println(list.get(0).getIndex());
	}
	
	static class Ajou implements Comparable<Ajou> {
		
		private int index;

		private int score;
		
		private int count;
		
		private int time;
		
		public int getIndex() {
			return index;
		}

		public Ajou(int index, String input) {
			String[] arr = input.split(" ");
			this.index = index;
			this.score = Integer.parseInt(arr[0]);
			this.count = Integer.parseInt(arr[1]);
			this.time = Integer.parseInt(arr[2]);
		}

		@Override
		public int compareTo(Ajou o) {
			// TODO Auto-generated method stub
			if (this.score > o.score) {
				return -1;
			}
			
			if (this.score < o.score) {
				return 1;
			}
			
			if (this.count < o.count) {
				return -1;
			}
			
			if (this.count > o.count) {
				return 1;
			}
			
			if (this.time < o.time) {
				return -1;
			}
			
			if (this.time > o.time) {
				return 1;
			}
			
			return 0;
		}
		
	}

}
