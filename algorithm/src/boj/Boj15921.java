package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj15921 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n == 0) {
			System.out.println("divide by zero");
		} else {
			String[] input = br.readLine().split(" ");
			Map<Integer, Integer> countMap = new HashMap<>();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int value = Integer.parseInt(input[i]);
				sum += value;
				if (countMap.containsKey(value)) {
					countMap.put(value, countMap.get(value) + 1);
				} else {
					countMap.put(value, 1);
				}
			}
			
			double avg = (double)sum / (double)n;
			double expect = 0.0;
			
			for (int key : countMap.keySet()) {
				expect += (double)key * ((double)countMap.get(key) / (double)n);
			}
			System.out.println(String.format("%.2f", avg/expect));
		}
	}

}
