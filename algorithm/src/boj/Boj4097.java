package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj4097 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("0")) {
			int n = Integer.parseInt(input);
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			
			int max = Collections.max(list);
			if (max <= 0) {
				sb.append(max).append(System.lineSeparator());
			} else {
				int sum = 0;
				int maxSum = 0;
				for (int i = 0; i < n; i++) {
					sum += list.get(i);
					if (sum > maxSum) {
						maxSum = sum;
					} else if (sum < 0) {
						sum = 0;
					}
				}
				sb.append(maxSum).append(System.lineSeparator());
			}
			
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
