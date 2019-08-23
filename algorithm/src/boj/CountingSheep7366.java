package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountingSheep7366 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String.format("Case %d: This list contains %d sheep.", 1,2);
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 1; i <= t; i++) {
			int count = 0;
			br.readLine();
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				if (st.nextToken().equals("sheep")) count++;
			}
			sb.append(String.format("Case %d: This list contains %d sheep.", i, count)).append(System.lineSeparator()).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}
}
