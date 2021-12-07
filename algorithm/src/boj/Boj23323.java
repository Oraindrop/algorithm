package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj23323 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			long n = Long.parseLong(st.nextToken());
			long m = Long.parseLong(st.nextToken());
			int count = 0;
			while (n > 0) {
				count++;
				n /= 2;
			}
			sb.append((m+count)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
