package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class MidTermScore15702 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
	
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		List<StudentScore> list = new ArrayList<>();
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int stNum = Integer.parseInt(st.nextToken());
			int score = 0;
			for (int j = 0; j < n; j++) {
				if (st.nextToken().equals("O")) {
					score += arr[j];
				}
			}
			list.add(new StudentScore(stNum, score));
		}
		
		Collections.sort(list);
		System.out.println(list.get(0).getStNum() + " " + list.get(0).getScore());
	}

}

class StudentScore implements Comparable<StudentScore>{
	
	private int stNum;
	
	private int score;

	public StudentScore(int stNum, int score) {
		this.stNum = stNum;
		this.score = score;
	}

	public int getStNum() {
		return stNum;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(StudentScore o) {
		// TODO Auto-generated method stub
		if (this.score > o.score) return -1;
		if (this.score < o.score) return 1;
		return this.stNum - o.stNum;
	}
	
	
	
}