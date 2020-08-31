package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj14579 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int answer = (a * (a+1)) / 2;
		int base = answer;
		for (int i = a+1; i <= b; i++) {
			base += i;
			answer %= 14579;
			base %= 14579;
			answer *= base;
		}
		
		System.out.println(answer % 14579);
	}

}
