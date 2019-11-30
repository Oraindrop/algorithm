package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class HelpChelsea11098 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		List<Player> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			list.clear();
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				list.add(new Player(Long.parseLong(st.nextToken()), st.nextToken()));
			}
			
			Collections.sort(list);
			sb.append(list.get(list.size() - 1).getName()).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

}

class Player implements Comparable<Player> {

	private long price;
	
	private String name;
	
	public Player(long price, String name) {
		this.price = price;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		if (this.price > o.price) return 1;
		if (this.price < o.price) return -1;
		return 0;
	}
	
}
