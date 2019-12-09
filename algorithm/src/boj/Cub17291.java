package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Cub17291 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int index = 1;
		String prefix = "BUG";
		Map<String, Integer> map = new HashMap<>();
		List<String> removes = new ArrayList<>();
		List<String> adds = new ArrayList<>();
		map.put(prefix + index, 3);
		index++;
		for (int i = 2; i <= t; i++) {
			removes.clear();
			adds.clear();
			Set<String> set = map.keySet();
			for (String k : set) {
				if (map.get(k) == 0) {
					removes.add(k);
				} else {
					map.put(k, map.get(k) - 1);
					adds.add(prefix + index);
					index++;
				}
			}
			
			for (String k : removes) {
				map.remove(k);
			}
			
			for (String k : adds) {
				map.put(k, i % 2 == 0 ? 4 : 3);
			}
		}
		
		removes.clear();
		for (String k : map.keySet()) {
			if (map.get(k) == 0) {
				removes.add(k);
			}
		}
		
		for (String k : removes) {
			map.remove(k);
		}
		
		System.out.println(map.keySet().size());
	}

}
