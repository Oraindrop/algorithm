package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CommonDiv5618 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = 0;
		int b = 0;
		int c = 0;
		
		if (n == 2) {
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
		} else {
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				System.out.println(i);
			}
		}
	}
}
