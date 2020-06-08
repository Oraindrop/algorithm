package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Boj1339 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String[] arr = s.split("");
			int leng = arr.length;
			for (int j = 0; j < leng; j++) {
				String c = arr[j];
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + (int)Math.pow(10, leng-1-j));
				} else {
					map.put(c, (int)Math.pow(10, leng-1-j));
				}
			}
		}
		List<Integer> numbers = new ArrayList<Integer>(map.values());
		int size = numbers.size();
		Collections.sort(numbers);
		int sum = 0;
		int mult = 9;
		for (int i = size - 1; i >= 0; i--) {
			sum += numbers.get(i) * mult;
			mult--;
		}
		
		System.out.println(sum);
	}

}
