package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FactorOrMultiple5086 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(!s.equals("0 0")) {
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (b % a == 0) {
				sb.append("factor");
			} else if (a % b == 0) {
				sb.append("multiple");
			} else {
				sb.append("neither");
			}
			sb.append(System.lineSeparator());
			s = br.readLine();
		}
		System.out.print(sb.toString());
	}

}
