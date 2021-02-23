package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj2246 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		List<Condo> list = new ArrayList<>();
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new Condo(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		for (int i = 0; i < n; i++) {
			Condo condo = list.get(i);
			boolean candidate = true;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (!condo.isCandidate(list.get(j))) {
						candidate = false;
						break;
					}
				}
			}
			if (candidate)
				answer++;
		}
		
		System.out.println(answer);
	}

	static class Condo {
		private int distance;
		private int price;
		
		public Condo(int distance, int price) {
			this.distance = distance;
			this.price = price;
		}

		private boolean isCandidate(Condo other) {
			if (this.distance >= other.distance && this.price >= other.price) {
				return false;
			}
			return true;
		}
		
	}
}
