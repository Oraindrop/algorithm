package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj11256 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			String[] inputs = br.readLine().split(" ");
			int candies = Integer.parseInt(inputs[0]);
			int n = Integer.parseInt(inputs[1]);
			
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				String[] arr = br.readLine().split(" ");
				list.add(Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]));
			}
			
			Collections.sort(list);
			
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (candies <= 0) {
					break;
				}
				
				int number = list.get(n - 1 - j);
				candies -= number;
				count++;
			}
			sb.append(count).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
