package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWord12605 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<String> list;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= t; i++) {
			String[] arr = br.readLine().split(" ");
			list = new ArrayList<>(Arrays.asList(arr));
			Collections.reverse(list);
			sb.append(String.format("Case #%s: ", i));
			for (String s : list) {
				sb.append(s).append(" ");
			}
			sb.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
