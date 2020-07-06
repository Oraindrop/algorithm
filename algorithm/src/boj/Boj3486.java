package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj3486 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(go(a, b)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static int go(int a, int b) {
		int ra = reverse(a);
		int rb = reverse(b);
		return reverse(ra+rb);
	}
	
	static int reverse(int i) {
		int reverse = 0;
		while (i > 0) {
			reverse *= 10;
			reverse += i % 10;
			i /= 10;
		}
		return reverse;
	}

}
