package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9094 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int count = 0;
			for (int a = 1; a < n; a++) {
				for (int b = a+1; b < n; b++) {
					double value = (double)(a*a + b*b + m) / (double)(a*b);
					if (isInteger(value)) {
						count++;
					}
				}
			}
			sb.append(count).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

	static boolean isInteger(double num) {
		int temp = (int)num;
		return (double)temp == num;
	}
}
