package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class SequenceAndQueryFifteen14427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int t = Integer.parseInt(br.readLine());
		int min = Collections.min(list);
		int minIndex = list.indexOf(min) + 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			
			if (op == 2) {
				sb.append(minIndex).append(System.lineSeparator());
			} else {
				int index = Integer.parseInt(st.nextToken());
				int value = Integer.parseInt(st.nextToken());
				list.add(index, value);
				list.remove(index - 1);
				if (index == minIndex) {
					if (value > min) {
						min = Collections.min(list);
						minIndex = list.indexOf(min) + 1;
					}
				}
				if (value == min) {
					if (index < minIndex) {
						minIndex = index;
					}
				} else if (value < min) {
					min = value;
					minIndex = index;
				}
			}
		}
		System.out.print(sb.toString());
	}

}
