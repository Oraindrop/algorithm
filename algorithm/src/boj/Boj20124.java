package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj20124 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<CustomCandidate> list = new ArrayList<>();
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new CustomCandidate(st.nextToken(), Long.parseLong(st.nextToken())));
		}
		
		Collections.sort(list);
		System.out.println(list.get(0).getName());
	}
	
	static class CustomCandidate implements Comparable<CustomCandidate> {
		
		private String name;
		
		private long score;
		
		public CustomCandidate(String name, long score) {
			this.name = name;
			this.score = score;
		}
		
		public String getName() {
			return name;
		}

		@Override
		public int compareTo(CustomCandidate other) {
			// TODO Auto-generated method stub
			if (this.score > other.score) {
				return -1;
			} else if (this.score < other.score) {
				return 1;
			} else {
				return this.name.compareTo(other.name);	
			}
		}
	}

}
