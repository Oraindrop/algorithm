package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BonusScore17389 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int bonus = 0;
		int score = 0;
		String[] s = br.readLine().split("");
		for (int i = 1; i <= n; i++) {
			if (s[i-1].equals("O")) {
				score += i;
				score += bonus;
				bonus++;
			} else {
				bonus = 0;
			}
		}
		System.out.println(score);
	}

}
