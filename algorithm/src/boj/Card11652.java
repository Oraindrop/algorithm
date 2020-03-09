package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Card11652 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Long, MyCard> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			go(map, Long.parseLong(br.readLine()));
		}
		
		List<MyCard> list = new ArrayList<>(map.values());
		Collections.sort(list);
		
		System.out.println(list.get(list.size()-1).getKey());
	}

	static void go(Map<Long, MyCard> map, long key) {
		if (map.get(key) == null) {
			map.put(key, new MyCard(key, 1));
		} else {
			map.get(key).add();
		}
	}
}

class MyCard implements Comparable<MyCard>{
	
	private long key;
	
	private int count;

	public long getKey() {
		return key;
	}

	public MyCard(long key, int count) {
		this.key = key;
		this.count = count;
	}
	
	public void add() {
		this.count++;
	}

	@Override
	public int compareTo(MyCard other) {
		// TODO Auto-generated method stub
		if (this.count < other.count) {
			return -1;
		} else if (this.count == other.count) {
			return Long.valueOf(other.key).compareTo(Long.valueOf(this.key));
		} else {
			return 1;
		}
	}
	
}