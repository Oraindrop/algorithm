package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RepresentativeValue2592 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			sum += n;
			if (map.get(n) == null) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1);
			}
		}
		
		int max = 0;
		int maxIndex = 0;
		for (int i : map.keySet()) {
			if (map.get(i) > max) {
				max = map.get(i);
				maxIndex = i;
			}
		}
		
		System.out.println(sum/10);
		System.out.println(maxIndex);
	}

}
