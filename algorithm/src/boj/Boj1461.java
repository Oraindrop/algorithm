package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj1461 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		List<Integer> negative = new ArrayList<>();
		List<Integer> positive = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());
			if (value > 0) {
				positive.add(value);
			} else {
				negative.add(value * -1);
			}
		}
		
		int sum = 0;
		Collections.sort(negative);
		Collections.sort(positive);
		Collections.reverse(negative);
		Collections.reverse(positive);
		
		int max = 0;
		if (positive.isEmpty()) {
			max = negative.get(0);
		} else if (negative.isEmpty()) {
			max = positive.get(0);
		} else {
			max = Math.max(positive.get(0), negative.get(0));	
		}
		
		for (int i = 0; i < negative.size(); i += m) {
			sum += negative.get(i) * 2;
		}
		
		for (int i = 0; i < positive.size(); i += m) {
			sum += positive.get(i) * 2;
		}
		
		sum -= max;
		System.out.println(sum);
		
	}

}
