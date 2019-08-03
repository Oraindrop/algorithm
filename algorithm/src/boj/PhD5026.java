package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PhD5026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			if (s.equals("P=NP")) {
				sb.append("skipped");
			} else {
				st = new StringTokenizer(s, "+");
				int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
				sb.append(sum);
			}
			sb.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
