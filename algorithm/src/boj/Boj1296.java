package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj1296 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		int inputL = count(input, 'L');
		int inputO = count(input, 'O');
		int inputV = count(input, 'V');
		int inputE = count(input, 'E');
		
		List<MyGirl> answers = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String candidate = br.readLine();
			
			int l = inputL + count(candidate, 'L');
			int o = inputO + count(candidate, 'O');
			int v = inputV + count(candidate, 'V');
			int e = inputE + count(candidate, 'E');
			
			int value = (l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e);
			value %= 100;

			answers.add(new MyGirl(candidate, value));
		}
		
		Collections.sort(answers);
		System.out.println(answers.get(0).getName());
	}
	
	public static int count(String s, char target) {
		char[] arr = s.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) count++;
		}
		return count;
	}
}

class MyGirl implements Comparable<MyGirl> {
	
	private String name;
	
	private int score;
	
	public MyGirl(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(MyGirl o) {
		if (this.score > o.score) {
			return -1;
		} else if (this.score < o.score) {
			return 1;
		} else {
			return this.name.compareTo(o.name);
		}
	}
}
