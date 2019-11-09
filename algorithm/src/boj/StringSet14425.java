package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringSet14425 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Boolean> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			map.put(br.readLine(), true);
		}
		
		int answer = 0;
		
		for (int i = 0; i < m; i++) {
			if (map.getOrDefault(br.readLine(), false)) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
