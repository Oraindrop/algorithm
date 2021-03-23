package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj19843 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Mon", 1);
		map.put("Tue", 2);
		map.put("Wed", 3);
		map.put("Thu", 4);
		map.put("Fri", 5);
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String d1 = st.nextToken();
			int h1 = Integer.parseInt(st.nextToken());
			String d2 = st.nextToken();
			int h2 = Integer.parseInt(st.nextToken());
			sum += ((map.get(d2) - map.get(d1)) * 24 + h2) - h1;
		}
		
		if (sum >= t) {
			System.out.println("0");
		} else if (t - sum > 48) {
			System.out.println("-1");
		} else {
			System.out.println(t - sum);
		}
	}

}
