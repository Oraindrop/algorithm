package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Marathoner10546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < t; i++) {
			String key = br.readLine();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);	
			}
		}
		
		for (int i = 0; i < t-1; i++) {
			String key = br.readLine();
			map.put(key, map.get(key) - 1);
		}
		
		System.out.println(map.keySet().stream().filter(k -> map.get(k) != 0).findFirst().get());
	}

}
