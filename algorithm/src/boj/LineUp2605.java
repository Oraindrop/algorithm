package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LineUp2605 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			int index = i - Integer.parseInt(st.nextToken());
			list.add(index, i+1);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i : list) {
			sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
		
	}

}
