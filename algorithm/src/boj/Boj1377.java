package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj1377 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<ForSorting> list = new ArrayList<>();
		List<ForSorting> sorted = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(br.readLine());
			ForSorting element = new ForSorting(value, i);
			list.add(element);
			sorted.add(element);
		}
		
		Collections.sort(sorted);
		
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			int diff = sorted.get(i).diff(list.get(i));
			if (diff > max) max = diff;
		}
		
		System.out.println(max+1);
	}
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}

class ForSorting implements Comparable<ForSorting> {
	
	private int value;
	
	private int index;

	public ForSorting(int value, int index) {
		this.value = value;
		this.index = index;
	}

	public int diff(ForSorting o) {
		return this.index - o.index;
	}
	
	@Override
	public int compareTo(ForSorting o) {
		// TODO Auto-generated method stub
		if (this.value > o.value) return 1;
		if (this.value < o.value) return -1;
		return 0;
	}
}
