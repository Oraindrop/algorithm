package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj18870 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<Integer> values = new HashSet<Integer>();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());
			values.add(value);
			list.add(value);
		}
		
		List<Integer> sortedList = new ArrayList<>(values);
		Collections.sort(sortedList);
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < sortedList.size(); i++) {
			map.put(sortedList.get(i), i);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i : list) {
			sb.append(map.get(i)).append(" ");
		}
		
		System.out.println(sb.toString());
	}
}

