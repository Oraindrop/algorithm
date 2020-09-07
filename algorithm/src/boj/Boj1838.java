package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj1838 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<ForBubbleSort> list = new ArrayList<>();
		List<ForBubbleSort> sortedList = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			long value = Long.parseLong(st.nextToken());
			ForBubbleSort e = new ForBubbleSort(value, i);
			list.add(e);
			sortedList.add(e);
		}
		
		Collections.sort(sortedList);
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			int diff = sortedList.get(i).diff(list.get(i));
			if (diff > max) {
				max = diff;
			}
		}
		
		System.out.println(max);
	}

}

class ForBubbleSort implements Comparable<ForBubbleSort> {
	
	private long value;
	
	private int index;

	public ForBubbleSort(long value, int index) {
		this.value = value;
		this.index = index;
	}
	
	public int diff(ForBubbleSort o) {
		return this.index - o.index;
	}

	@Override
	public int compareTo(ForBubbleSort o) {
		// TODO Auto-generated method stub
		if (this.value > o.value) return 1;
		if (this.value < o.value) return -1;
		return 0;
	}
	
}
