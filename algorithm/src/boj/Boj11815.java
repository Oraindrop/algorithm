package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11815 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			long x = Long.parseLong(st.nextToken());
			long sqrt = (long) (Math.sqrt((double)x) + 0.5);
			sb.append(sqrt * sqrt == x ? 1 : 0).append(" ");
		}
		System.out.println(sb.toString());
	}

}
