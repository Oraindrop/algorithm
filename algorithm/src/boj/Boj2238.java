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

public class Boj2238 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		Map<Integer, MyAuction> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int price = Integer.parseInt(st.nextToken());
			if (map.get(price) == null) {
				map.put(price, new MyAuction(price, name, 1));
			} else {
				map.get(price).add();
			}
		}
		
		List<MyAuction> list = new ArrayList<>(map.values());
		Collections.sort(list);
		System.out.println(list.get(0));
	}

}

class MyAuction implements Comparable<MyAuction>{
	
	private int price;
	
	private String name;
	
	private int count;

	public MyAuction(int price, String name, int count) {
		this.price = price;
		this.name = name;
		this.count = count;
	}
	
	public void add() {
		this.count++;
	}

	@Override
	public String toString() {
		return name + " " + price;
	}

	@Override
	public int compareTo(MyAuction o) {
		if (this.count < o.count) {
			return -1;
		} else if (this.count > o.count) {
			return 1;
		} else {
			return this.price - o.price;
		}
	}
	
	
	
}