package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj2535 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<AsiaInfoStudent> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(AsiaInfoStudent.of(br.readLine()));
		}
		
		Collections.sort(list);
		
		List<AsiaInfoStudent> answers = new ArrayList<>();
		answers.add(list.get(0));
		answers.add(list.get(1));
		
		boolean check = list.get(0).sameCountry(list.get(1));
		if (check) {
			for (int i = 2; i < n; i++) {
				if (!list.get(0).sameCountry(list.get(i))) {
					answers.add(list.get(i));
					break;
				}
			}
		} else {
			answers.add(list.get(2));
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(answers.get(i).toString());
		}
	}

}

class AsiaInfoStudent implements Comparable<AsiaInfoStudent> {
	
	private int country;
	
	private int studentNumber;
	
	private int score;
	
	public AsiaInfoStudent(int country, int studentNumber, int score) {
		this.country = country;
		this.studentNumber = studentNumber;
		this.score = score;
	}

	public static AsiaInfoStudent of(String s) {
		String[] arr = s.split(" ");
		return new AsiaInfoStudent(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
	}
	
	public boolean sameCountry(AsiaInfoStudent o) {
		return this.country == o.country;
	}

	@Override
	public int compareTo(AsiaInfoStudent o) {
		// TODO Auto-generated method stub
		if (this.score < o.score) return 1;
		if (this.score > o.score) return -1;
		return 0;
	}

	@Override
	public String toString() {
		return country + " " + studentNumber;
	}
}
