package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Seven14729 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Double> list = new ArrayList<>();
		
		for (int i = 0; i < 7; i++) {
			list.add(Double.parseDouble(br.readLine()));
		}
		
		for (int i = 0; i < n - 7; i++) {
			Collections.sort(list);
			double max = list.get(6);
			double input = Double.parseDouble(br.readLine());
			if (max > input) {
				list.add(input);
				Collections.sort(list);
				list.remove(7);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		Collections.sort(list);
		for (int i = 0; i < 7; i++) {
			sb.append(String.format("%.3f", list.get(i))).append(System.lineSeparator());	
		}
		
		System.out.println(sb.toString());
		
	}

}
