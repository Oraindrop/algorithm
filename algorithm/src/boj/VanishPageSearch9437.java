package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VanishPageSearch9437 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("0")) {
			st = new StringTokenizer(input);
			int n = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			if (p <= n/2) {
				if (p % 2 == 1) {
					sb.append(p + 1).append(" ").append(n - p).append(" ").append(n - p + 1).append(System.lineSeparator());
				} else {
					sb.append(p - 1).append(" ").append(n - p + 1).append(" ").append(n - p + 2).append(System.lineSeparator());
				}
			} else {
				if (p % 2 == 1) {
					sb.append(n - p).append(" ").append(n - p + 1).append(" ").append(p + 1).append(System.lineSeparator());
				} else {
					sb.append(n - p + 1).append(" ").append(n - p + 2).append(" ").append(p - 1).append(System.lineSeparator());
				}
			}
			
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
