package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CarbonatedDrink5032 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int b = (e+f) / c;
		int m = (e+f) % c;
		
		int val = b + m;
		int answer = b;

		while (val >= c) {
			int mod = val % c;
			val /= c;
			answer += val;
			val += mod;
		}
		
		System.out.println(answer);
	}

}
