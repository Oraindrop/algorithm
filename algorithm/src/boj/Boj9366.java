package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj9366 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.clear();
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(list);
			sb.append("Case #").append((i+1)).append(": ");
			if (list.get(2) >= list.get(0) + list.get(1)) {
				sb.append("invalid!");
			} else if (list.get(0) == list.get(1) && list.get(1) == list.get(2)) {
				sb.append("equilateral");
			} else if (list.get(0) == list.get(1) || list.get(1) == list.get(2) || list.get(0) == list.get(2)) {
				sb.append("isosceles");
			} else {
				sb.append("scalene");
			}
			sb.append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

}
