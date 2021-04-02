package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj16212 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		List<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		for (int i : list) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb.toString());
	}

}
