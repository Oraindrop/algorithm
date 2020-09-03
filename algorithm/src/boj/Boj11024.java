package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11024 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int answer = 0;
			while (st.hasMoreTokens()) {
				answer += Integer.parseInt(st.nextToken());
			}
			sb.append(answer).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
