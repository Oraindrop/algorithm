package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj22966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<MyQuestion> list = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			list.add(new MyQuestion(br.readLine()));
		}
		
		Collections.sort(list);
		System.out.println(list.get(0).getTitle());
	}
	
	static class MyQuestion implements Comparable<MyQuestion> {
		
		private int level;
		
		private String title;
		
		public MyQuestion(String input) {
			String[] arr = input.split(" ");
			this.title = arr[0];
			this.level = Integer.parseInt(arr[1]);
		}

		public String getTitle() {
			return title;
		}

		@Override
		public int compareTo(MyQuestion o) {
			return Integer.compare(level, o.level);
		}
		
		
		
	}

}
