package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class HighClassMath7510 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			list.clear();
			list.add(Integer.parseInt(st.nextToken()));
			list.add(Integer.parseInt(st.nextToken()));
			list.add(Integer.parseInt(st.nextToken()));
			
			Collections.sort(list);
			
			int a = list.get(0);
			int b = list.get(1);
			int c = list.get(2);
			sb.append(String.format("Scenario #%s:", (i+1)))
				.append(System.lineSeparator())
				.append(go(a, b, c))
				.append(System.lineSeparator())
				.append(System.lineSeparator());
		}
		
		System.out.println(sb.toString());
	}

	static String go (int a, int b, int c) {
		if (a + b <= c)
			return "no";
		
		long powA = a * a;
		long powB = b * b;
		long sum = powA + powB;
		long powC = c * c;
		
		if (powC == sum)
			return "yes";
		
		return "no";
	}
}
