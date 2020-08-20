package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int answer = 1;
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = (3 * n) + 1;
			}
			answer++;
		}
		
		System.out.println(answer);
	}

}
