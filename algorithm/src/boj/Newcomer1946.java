package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Newcomer1946 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			List<Newcomer> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int aScore = Integer.parseInt(st.nextToken());
				int bScore = Integer.parseInt(st.nextToken());
				list.add(new Newcomer(aScore, bScore)); 
			}
			
			Collections.sort(list, new Comparator<Newcomer>() {
				@Override
				public int compare(Newcomer o1, Newcomer o2) {
					// TODO Auto-generated method stub
					return o1.getaScore() - o2.getaScore();
				}
				
			});
			int interviewMax = list.get(0).getbScore();
			int answer = 1;
			for (int j = 1; j < n; j++) {
				int interview = list.get(j).getbScore();
				if (interviewMax > interview) {
					interviewMax = interview;
					answer++;
				}
			}
			
			System.out.println(answer);
		}
	}

}

class Newcomer {
	private int aScore;
	private int bScore;
	
	public Newcomer(int aScore, int bScore) {
		this.aScore = aScore;
		this.bScore = bScore;
	}

	public int getaScore() {
		return aScore;
	}

	public int getbScore() {
		return bScore;
	}

	@Override
	public String toString() {
		return "Newcomer [aScore=" + aScore + ", bScore=" + bScore + "]";
	}
}