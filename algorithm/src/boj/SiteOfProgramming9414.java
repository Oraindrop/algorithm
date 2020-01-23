package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SiteOfProgramming9414 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			list.clear();
			String input = br.readLine();
			while (!input.equals("0")) {
				list.add(Integer.parseInt(input));
				input = br.readLine();
			}
			int size = list.size();
			if (size > 7) {
				sb.append("Too expensive").append(System.lineSeparator());
			} else {
				Collections.sort(list);
				long answer = 0;
				for (int j = 0; j < size; j++) {
					int value = list.get(size - 1 - j);
					answer += 2 * Math.pow(value, j+1);
				}
				sb.append(answer > 5000000 ? "Too expensive" : answer).append(System.lineSeparator());
			}
		}
		System.out.print(sb.toString());
	}

}
