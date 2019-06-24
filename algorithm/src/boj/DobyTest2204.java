package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DobyTest2204 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while (t != 0) {
			List<MyWord> list = new ArrayList<>();
			for (int i = 0; i < t; i++) {
				String s = br.readLine();
				list.add(new MyWord(s, s.toLowerCase()));
			}
			Collections.sort(list);
			System.out.println(list.get(0).getOrigin());
			t = Integer.parseInt(br.readLine());
		}
	}
}

class MyWord implements Comparable<MyWord>{
	private String origin;
	private String displaySort;
	
	public String getOrigin() {
		return origin;
	}

	public MyWord(String origin, String displaySort) {
		this.origin = origin;
		this.displaySort = displaySort;
	}

	@Override
	public int compareTo(MyWord other) {
		// TODO Auto-generated method stub
		return this.displaySort.compareTo(other.displaySort);
	}
}
