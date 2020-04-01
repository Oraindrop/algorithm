package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberOfZero11170 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int count = 0;
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			if (n == 0) {
				count++;
				n++;
			}
			for (int j = n; j <= m; j++) {
				count += countZero(j);
			}
			sb.append(count).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
	
	static int countZero(int value) {
		int count = 0;
		while (value > 0) {
			if (value % 10 == 0) {
				count++;
			}
			value /= 10;
		}
		return count;
	}

}
