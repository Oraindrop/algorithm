package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JoonSeokMathHomeWork17206 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine());
		String[] sArr = br.readLine().split(" ");
		
		Set<Integer> set = new HashSet<>();
		for (int i = 3; i <= 80000; i += 3) {
			set.add(i);
		}
		
		for (int i = 7; i <= 80000; i += 7) {
			set.add(i);
		}
		
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		
		long[] arr = new long[80001];
		int lastIndex = 0;
		
		for (int value : list) {
			for (int i = lastIndex+1; i < value; i++) {
				arr[i] = arr[lastIndex];
			}
			
			arr[value] = arr[value-1] + value;
			lastIndex = value;
		}
		
		for (int i = lastIndex+1; i < 80001; i++) {
			arr[i] = arr[lastIndex];
		}
		
		StringBuilder sb = new StringBuilder();
		for (String s : sArr) {
			sb.append(arr[Integer.parseInt(s)]).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
