package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2506 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int score = 1;
		int answer = 0;
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());
			if (value == 1) {
				answer += score;
				score++;
			} else {
				score = 1;
			}
		}
		
		System.out.println(answer);
	}

}
