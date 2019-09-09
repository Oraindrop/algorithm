package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class EatOrEaten7795 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<Integer> aList = new ArrayList<>();
		List<Integer> bList = new ArrayList<>();
		StringTokenizer st;
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			aList.clear();
			bList.clear();
			int aSize = Integer.parseInt(st.nextToken());
			int bSize = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreTokens()) {
				aList.add(Integer.parseInt(st.nextToken()));
			}
			
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreTokens()) {
				bList.add(Integer.parseInt(st.nextToken()));
			}
			
			Collections.sort(aList);
			Collections.sort(bList);
			int answer = 0;
			for (int k = 0; k < aSize; k++) {
				int a = aList.get(k);
				int value = 0;
				for (int j = 0; j < bSize; j++) {
					int b = bList.get(j);
					if (a > b) {
						value++;
					} else {
						break;
					}
				}
				
				if (value == bSize) {
					value *= (aSize - k);
					answer += value;
					break;
				}
				answer += value;
			}
			System.out.println(answer);
		}
	}

}
