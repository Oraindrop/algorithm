package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Boj7662 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> treeMap = new TreeMap<>(); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			treeMap.clear();
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String op = st.nextToken();
				int key = Integer.parseInt(st.nextToken());
				if (op.equals("I")) {
					if (treeMap.containsKey(key)) {
						int count = treeMap.get(key);
						treeMap.put(key, count+1);
					} else {
						treeMap.put(key, 0);
					}
				} else {
					if (!treeMap.isEmpty()) {
						if (key == 1) {
							Map.Entry<Integer, Integer> e = treeMap.pollLastEntry(); 
							if (e.getValue() != 0) {
								treeMap.put(e.getKey(), e.getValue()-1);
							}
						} else {
							Map.Entry<Integer, Integer> e = treeMap.pollFirstEntry();
							if (e.getValue() != 0) {
								treeMap.put(e.getKey(), e.getValue()-1);
							}
						}
					}
				}
			}
			if (treeMap.isEmpty()) {
				sb.append("EMPTY");
			} else {
				int min = treeMap.firstKey();
				int max = treeMap.lastKey();
				sb.append(max).append(" ").append(min);
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
