package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj17264 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int winPoint = Integer.parseInt(st.nextToken());
		int losePoint = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		
		Set<String> set = new HashSet<>();
		for (int i = 0; i < p; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String op = st.nextToken();
			
			if (op.equals("W")) {
				set.add(name);
			}
		}
		
		int score = 0;
		boolean result = false;
		for (int i = 0; i < n; i++) {
			String name = br.readLine();
			if (set.contains(name)) {
				score += winPoint;
			} else {
				score -= losePoint;
				if (score < 0) {
					score = 0;
				}
			}
			
			if (score >= target) {
				result = true;
			}
		}
		
		System.out.println(result ? "I AM NOT IRONMAN!!" : "I AM IRONMAN!!");
	}

}
