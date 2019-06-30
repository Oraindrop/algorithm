package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Soldier1321 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			map.put(i, Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());
			if (command == 1) {
				int index = Integer.parseInt(st.nextToken()) - 1;
				int inc = Integer.parseInt(st.nextToken());
				map.put(index, map.get(index) + inc);
			} else {
				int value = Integer.parseInt(st.nextToken());
				sb.append(go(map, value));
				sb.append(System.lineSeparator());
			}
		}
		
		System.out.println(sb.toString());
	}
	
	static int go(Map<Integer, Integer> map, int value) {
		int sum = 0;
		for (int i = 1; i <= map.size(); i++) {
			sum += map.get(i);
			if (sum >= value)
				return i;
		}
		return 0;
	}

}
