package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MagicMirror11586 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<List<String>> list = new ArrayList<>();
		
		for (int i = 0; i < t; i++) {
			list.add(Arrays.asList(br.readLine().split("")));
		}
		int k = Integer.parseInt(br.readLine());
		
		List<List<String>> answer = new ArrayList<>();
		if (k == 1) {
			print(list);
		} else if (k == 2) {
			for (List<String> sList : list) {
				Collections.reverse(sList);
			}
			print(list);
		} else {
			for (int i = t - 1; i >= 0; i--) {
				answer.add(list.get(i));
			}
			print(answer);
		}
		
	}
	
	static void print(List<List<String>> list) {
		StringBuilder sb = new StringBuilder();
		
		for (List<String> sList : list) {
			for (String s : sList) {
				sb.append(s);
			}
			sb.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
