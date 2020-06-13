package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj9461 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		int max = Collections.max(list);
		long[] arr = getNumbers(max);
		StringBuilder sb = new StringBuilder();
		
		for (int n : list) {
			sb.append(arr[n]).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());

	}
	
	static long[] getNumbers(int max) {
		long[] arr = new long[max+1];
		
		if (max < 4) {
			for (int i = 0; i < max; i++) {
				arr[i] = 1;
			}
		} else {
			for (int i = 1; i < 4; i++) {
				arr[i] = 1;
			}
			
			for (int i = 4; i <= max; i++) {
				arr[i] = arr[i-2] + arr[i-3];
			}
		}
		
		return arr;
	}

}
