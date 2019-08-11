package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SoongKoHan17388 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		String answer = go(a, b, c);
		System.out.println(answer);
		
	}

	private static String go(int a, int b, int c) {
		if (a + b + c > 99)
			return "OK";
		
		int min = Math.min(Math.min(a, b), c);
		
		if (a == min)
			return "Soongsil";
		if (b == min)
			return "Korea";
		
		return "Hanyang";
	}

}
