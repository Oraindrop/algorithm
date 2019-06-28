package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Dice1233 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new HashMap<>();
		
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				for (int k = 1; k <= c; k++) {
					int sum = i + j + k;
					if (map.containsKey(sum)) {
						map.put(sum, map.get(sum) + 1);
					} else {
						map.put(sum, 1);
					}
				}
			}
		}
		
		int maxValue = 0;
		int maxKey = 0;
		
		for (int key : map.keySet()) {
			int value = map.get(key);
			if (value > maxValue) {
				maxValue = value;
				maxKey = key;
			} else if (value == maxValue) {
				maxKey = maxKey < key ? maxKey : key;
			}
		}
		
		System.out.println(maxKey);
	}

}
