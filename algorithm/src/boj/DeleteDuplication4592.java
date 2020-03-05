package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DeleteDuplication4592 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("0")) {
			st = new StringTokenizer(input);
			int n = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			sb.append(value).append(" ");
			for (int i = 1; i < n; i++) {
				int cur = Integer.parseInt(st.nextToken());
				if (value != cur) {
					sb.append(cur).append(" ");
					value = cur;
				}
			}
			sb.append("$").append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.println(sb.toString());
	}

}
