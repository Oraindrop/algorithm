package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Kayak2890 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<String> list = Arrays.asList("111", "222", "333", "444", "555", "666", "777", "888", "999");
		int r = Integer.parseInt(st.nextToken());
		
		List<Team> teams = new ArrayList<>();
		for (int i = 0; i < r; i++) {
			String input = br.readLine();
			for (int j = 0; j < 9; j++) {
				if (input.contains(list.get(j))) {
					teams.add(new Team(j+1, input.indexOf(list.get(j))));
				}
			}
		}
		
		Collections.sort(teams);
		teams.get(0).setScore(1);
		
		for (int i = 1; i < 9; i++) {
			Team pre = teams.get(i-1);
			Team cur = teams.get(i);
			cur.setScore(cur.isTieScore(pre) ? pre.getScore() : pre.getScore() + 1);
		}
		
		int[] arr = new int[9];
		for (Team team : teams) {
			arr[team.getId() - 1] = team.getScore();
		}
		
		for (int i = 0; i < 9; i++) {
			System.out.println(arr[i]);
		}
	}

}

class Team implements Comparable<Team> {
	
	private int id;
	
	private int location;
	
	private int score;

	public Team(int id, int location) {
		super();
		this.id = id;
		this.location = location;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return o.location - this.location;
	}
	
	public boolean isTieScore(Team o) {
		return this.location == o.location;
	}
}
