package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberPlay2145 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		while (n != 0) {
			while (n >= 10) {
				n = go(n);
			}
			sb.append(n).append(System.lineSeparator());
			n = Integer.parseInt(br.readLine());
		}
		System.out.print(sb.toString());
	}

	static int go(int n) {
		int answer = 0;
		while (n > 0) {
			answer += n % 10;
			n /= 10;
		}
		
		return answer;
	}
}
