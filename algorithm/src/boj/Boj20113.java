package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj20113 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int key = Integer.parseInt(st.nextToken());
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		
		int max = Collections.max(map.values());
		int answer = -1;
		int count = 0;
		
		for (int key : map.keySet()) {
			if (map.get(key) == max) {
				answer = key;
				count++;
			}
		}
		
		System.out.println(answer == 0 || count > 1 ? "skipped" : answer);
		
	}

}
