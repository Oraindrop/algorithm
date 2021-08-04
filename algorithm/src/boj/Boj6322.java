package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj6322 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int index = 1;
		
		while (!input.equals("0 0 0")) {
			sb.append("Triangle #").append(index).append(System.lineSeparator());
			st = new StringTokenizer(input);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			double answer = 0.0;
			if (a == -1) {
				if (b >= c) {
					sb.append("Impossible.").append(System.lineSeparator()).append(System.lineSeparator());
				} else {
					answer = Math.sqrt(c*c - b*b);
					if (answer + b > c) {
						sb.append(String.format("%.3f", answer)).append(System.lineSeparator()).append(System.lineSeparator());
					} else {
						sb.append("Impossible.").append(System.lineSeparator()).append(System.lineSeparator());
					}
				}
			} else if (b == -1) {
				if (a >= c) {
					sb.append("Impossible.").append(System.lineSeparator());
				} else {
					answer = Math.sqrt(c*c - a*a);
					if (answer + a > c) {
						sb.append(String.format("%.3f", answer)).append(System.lineSeparator()).append(System.lineSeparator());
					} else {
						sb.append("Impossible.").append(System.lineSeparator()).append(System.lineSeparator());
					}
				}
			} else {
				answer = Math.sqrt(a*a + b*b);
				if (answer < a + b) {
					sb.append(String.format("%.3f", answer)).append(System.lineSeparator()).append(System.lineSeparator());
				} else {
					sb.append("Impossible.").append(System.lineSeparator()).append(System.lineSeparator());
				}
			}
			index++;
			input = br.readLine();
		}
		System.out.println(sb.toString());
	}

}
