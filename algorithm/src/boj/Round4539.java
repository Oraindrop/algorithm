package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round4539 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			int target = Integer.parseInt(s);
			int leng = s.length();
			for (int j = 1; j < leng; j++) {
				int div = (int)Math.pow(10, j);
				int mod = target % div;
				if (mod / (div/10) >= 5) {
					target += (div - mod);
				} else {
					target -= mod;
				}
			}
			sb.append(target).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
}
