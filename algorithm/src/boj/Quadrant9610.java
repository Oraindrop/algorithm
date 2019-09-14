package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quadrant9610 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int q1 = 0;
		int q2 = 0;
		int q3 = 0;
		int q4 = 0;
		int axis = 0;
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 0 || b == 0) {
				axis++;
			} else if (a > 0 && b > 0) {
				q1++;
			} else if (a < 0 && b > 0) {
				q2++;
			} else if (a < 0 && b < 0) {
				q3++;
			} else if (a > 0 && b < 0) {
				q4++;
			}
		}
		
		sb.append("Q1: ").append(q1).append(System.lineSeparator())
		.append("Q2: ").append(q2).append(System.lineSeparator())
		.append("Q3: ").append(q3).append(System.lineSeparator())
		.append("Q4: ").append(q4).append(System.lineSeparator())
		.append("AXIS: ").append(axis);
		
		System.out.println(sb.toString());
	}

}
