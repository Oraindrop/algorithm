package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Boj20291 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split("\\.");
			if (map.containsKey(input[1])) {
				map.put(input[1], map.get(input[1]) + 1);
			} else {
				map.put(input[1], 1);
			}
		}
		
		List<String> keys = new ArrayList<String>(map.keySet());
		Collections.sort(keys);
		
		StringBuilder sb = new StringBuilder();
		
		for (String key : keys) {
			sb.append(key).append(" ").append(map.get(key)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
