package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9288 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			sb.append(String.format("Case %d:", (i+1))).append(System.lineSeparator());
			int n = Integer.parseInt(br.readLine());
			for (int j = 1; j <= 6; j++) {
				for (int k = j; k <= 6; k++) {
					if (j + k == n) {
						sb.append("(").append(j).append(",").append(k).append(")").append(System.lineSeparator());
					}
				}
			}
		}
		System.out.print(sb.toString());
	}
}
