package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecoveryNumber2312 {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			go(Integer.parseInt(br.readLine()));
		}
		System.out.println(sb.toString());
	}
	
	static void go(int n) {
		int cnt = 0;
		int div = 2;
		
		while (n > 1) {
			while (n % div == 0) {
				n /= div;
				cnt++;
			}
			if (cnt != 0) sb.append(div).append(" ").append(cnt).append(System.lineSeparator());
			cnt = 0;
			div++;
		}
	}

}
