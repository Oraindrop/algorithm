package boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Boj4358 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double total = 0;
		Map<String, Integer> map = new HashMap<>();
		while (sc.hasNextLine()) {
			String key = sc.nextLine();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
			total++;
		}
		
		List<String> keyList = new ArrayList<String>(map.keySet());
		Collections.sort(keyList);
		
		StringBuilder sb = new StringBuilder();
		for (String key : keyList) {
			String value = String.format("%.4f", (map.get(key) / total) * 100);
			sb.append(key).append(" ").append(value).append(System.lineSeparator());	
		}
		
		System.out.println(sb.toString());		
		sc.close();
	}

}
