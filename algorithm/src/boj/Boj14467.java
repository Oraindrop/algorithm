package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj14467 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		StringTokenizer st;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			 st = new StringTokenizer(br.readLine());
			 int key = Integer.parseInt(st.nextToken());
			 int value = Integer.parseInt(st.nextToken());
			 
			 if (map.containsKey(key)) {
				 if (map.get(key) != value) {
					 map.put(key, value);
					 answer++;
				 }
			 } else {
				 map.put(key, value);
			 }
		}
		System.out.println(answer);

	}

}
