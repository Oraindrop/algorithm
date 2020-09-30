package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			int floor = ((n-1) % h) + 1;
			int ho = ((n-1) / h) + 1;
			sb.append(String.format("%d%02d", floor, ho)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
