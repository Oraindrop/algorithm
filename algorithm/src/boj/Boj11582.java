package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj11582 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		int k = Integer.parseInt(br.readLine());
		List<Integer> answers = new ArrayList<Integer>();
		int t = n / k;
		for (int i = 0; i < n; i += t) {
			answers.addAll(sort(list.subList(i, i+t)));
		}
		StringBuilder sb = new StringBuilder();
		for (int i : answers) {
			sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
		
	}
	
	static List<Integer> sort(List<Integer> list) {
		Collections.sort(list);
		return list;
	}

}
