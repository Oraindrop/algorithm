package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompareOperator5656 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 12000; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String op = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			if (op.equals("E")) {
				break;
			}
			sb.append("Case ").append(i).append(": ");
			if (op.equals(">")) {
				sb.append(a > b);
			} else if (op.equals(">=")) {
				sb.append(a >= b);
			} else if (op.equals("<")) {
				sb.append(a < b);
			} else if (op.equals("<=")) {
				sb.append(a <= b);
			} else if (op.equals("==")) {
				sb.append(a == b);
			} else if (op.equals("!=")) {
				sb.append(a != b);
			}
			
			sb.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
