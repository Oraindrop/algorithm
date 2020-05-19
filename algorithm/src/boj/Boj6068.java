package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj6068 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<CustomTask> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new CustomTask(br.readLine()));
		}
		
		Collections.sort(list);
		
		int newDue = list.get(0).getDue();
		for (CustomTask t : list) {
			t.moveUpIfNeed(newDue);
			newDue = t.calcNewDue();
		}
		
		int answer = list.get(n-1).calcNewDue();
		System.out.println(answer < 0 ? -1 : answer);
	}
}

class CustomTask implements Comparable<CustomTask>{
	
	private int time;
	
	private int due;

	public CustomTask(String input) {
		String[] arr = input.split(" ");
		this.time = Integer.parseInt(arr[0]);
		this.due = Integer.parseInt(arr[1]);
	}
	
	public void moveUpIfNeed(int newDue) {
		if (this.due > newDue) {
			this.due = newDue;
		}
	}
	
	public int calcNewDue() {
		return this.due - this.time;
	}
	
	public int getDue() {
		return due;
	}

	public void setDue(int due) {
		this.due = due;
	}

	@Override
	public int compareTo(CustomTask o) {
		// TODO Auto-generated method stub
		return o.due - this.due;
	}

}
