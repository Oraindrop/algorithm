package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxValue2566 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		List<Integer> maxList = new ArrayList<>();
		
		for (int i = 0; i < 9; i++) {
			String[] s = br.readLine().split(" ");
			int max = 0;
			int index = 0;
			for (int j = 0; j < 9; j++) {
				int value = Integer.parseInt(s[j]);
				if (value > max) {
					max = value;
					index = j;
				}
			}
			maxList.add(max);
			
			map.put("index"+i+max, index);
		}
		
		int max = Collections.max(maxList);
		int maxIndex = maxList.indexOf(new Integer(max));
		int maxIndex2 = map.get("index"+maxIndex+max);
		
		maxIndex++;
		maxIndex2++;
		System.out.println(max);
		System.out.println(maxIndex + " " + maxIndex2);
	}

}
