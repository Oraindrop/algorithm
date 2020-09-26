package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2985 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if (a + b == c) {
			System.out.println(a + "+" + b + "=" + c);
		} else if (a - b == c) {
			System.out.println(a + "-" + b + "=" + c);
		} else if (a * b == c) {
			System.out.println(a + "*" + b + "=" + c);
		} else if (a / b == c && a % b == 0) {
			System.out.println(a + "/" + b + "=" + c);
		} else if (b + c == a) {
			System.out.println(a + "=" + b + "+" + c);
		} else if (b - c == a) {
			System.out.println(a + "=" + b + "-" + c);
		} else if (b * c == a) {
			System.out.println(a + "=" + b + "*" + c);
		} else if (b / c == a && b % c == 0) {
			System.out.println(a + "=" + b + "/" + c);
		}
		
	}

}
