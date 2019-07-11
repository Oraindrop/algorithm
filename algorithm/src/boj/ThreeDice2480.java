package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class ThreeDice2480 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Set<Integer> set = new HashSet<>(list);
		int size = set.size();
		int answer = 0;
		
		if (size == 3) {
			answer = Collections.max(list) * 100;
		} else if (size == 2) {
			for (Integer i : set) {
				list.remove(i);
			}
			answer = list.get(0) * 100 + 1000;
		} else {
			answer = list.get(0) * 1000 + 10000;
		}
		
		System.out.println(answer);
	}
}
