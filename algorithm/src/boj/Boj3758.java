package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj3758 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int x = 0; x < t; x++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			Integer.parseInt(st.nextToken());
			int key = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int answer = 0;
			
			Map<Integer, KCPCTeam> map = new HashMap<>();
			
			for (int i = 1; i <= n; i++) {
				map.put(i, new KCPCTeam(i));
			}
			
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int id = Integer.parseInt(st.nextToken());
				int problem = Integer.parseInt(st.nextToken());
				int score = Integer.parseInt(st.nextToken());
				
				KCPCTeam kcpcTeam = map.get(id);
				kcpcTeam.scoring(problem, score, i);
			}
			
			List<KCPCTeam> list = new ArrayList<>(map.values());
			for (KCPCTeam team : list) {
				team.calculate();
			}
			
			Collections.sort(list);
			for (int i = 0; i < n; i++) {
				if (key == list.get(i).getId()) {
					answer = n - i;
					break;
				}
			}
			sb.append(answer).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}

class KCPCTeam implements Comparable<KCPCTeam>{
	
	private int id;
	
	private Map<Integer, Integer> scoreMap;
	
	private int score;
	
	private int count;
	
	private long time;
	
	public int getId() {
		return id;
	}

	public KCPCTeam(int id) {
		this.id = id;
		this.scoreMap = new HashMap<>();
	}
	
	public void calculate() {
		for (int i : scoreMap.values()) {
			this.score += i;
		}
	}
	
	public void scoring(int problem, int score, int time) {
		this.count++;
		int asis = scoreMap.getOrDefault(problem, 0);
		if (score >= asis) {
			scoreMap.put(problem, score);
		}
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "KCPCTeam [id=" + id + ", scoreMap=" + scoreMap + ", score=" + score + ", count=" + count + "]";
	}

	@Override
	public int compareTo(KCPCTeam o) {
		// TODO Auto-generated method stub
		if (this.score > o.score) {
			return 1;
		} else if (this.score < o.score) {
			return -1;
		} else {
			if (this.count < o.count) {
				return 1;
			} else if (this.count > o.count) {
				return -1;
			} else {
				if (this.time < o.time) {
					return 1;
				} else if (this.time > o.time) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}
	
}
