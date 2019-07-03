package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiggestKeumMinNumber1526 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int target = Integer.parseInt(s);
		int size = s.length();
		
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(7);
		int preSize = 0;
		for (int i = 1; i < size; i++) {
			int curSize = list.size();
			for (int j = preSize; j < curSize; j++) {
				int mul = (int) Math.pow(10, i);
				list.add(mul * 4 + list.get(j));
				list.add(mul * 7 + list.get(j));
			}
			preSize = curSize;
		}
		
		Collections.sort(list);

		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) <= target) {
				System.out.println(list.get(i));
				break;
			}
		}
	}
}
