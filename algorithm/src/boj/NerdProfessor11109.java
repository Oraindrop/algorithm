package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NerdProfessor11109 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			int a = (n * p) + d;
			int b = s * n;
			
			if (a < b) {
				sb.append("parallelize");
			} else if (a == b) {
				sb.append("does not matter");
			} else {
				sb.append("do not parallelize");
			}
			
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
