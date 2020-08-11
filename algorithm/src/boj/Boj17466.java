package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj17466 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long p = Long.parseLong(st.nextToken());
		long answer = 1;
		for (int i = 2; i <= n; i++) {
			answer *= i;
			answer %= p;
		}
		System.out.println(answer);
	}

}
