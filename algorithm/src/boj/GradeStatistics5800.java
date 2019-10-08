package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GradeStatistics5800 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= t; i++) {
			String[] arr = br.readLine().split(" ");
			list = Arrays.stream(arr).map(Integer::parseInt).collect(Collectors.toList());
			list.remove(0);
			Collections.sort(list);
			int gap = 0;
			for (int j = 0; j < list.size() - 1; j++) {
				int a = list.get(j);
				int b = list.get(j+1);
				gap = b - a > gap ? b - a : gap;
			}
			sb.append("Class ").append(i).append(System.lineSeparator());
			sb.append("Max ").append(list.get(list.size()-1)).append(", ").append("Min ").append(list.get(0)).append(", ").append("Largest gap ").append(gap).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

}
