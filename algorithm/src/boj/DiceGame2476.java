package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class DiceGame2476 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		StringTokenizer st;
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int prize = 0;
			if (a == b && b == c) {
				prize = 10000 + (a * 1000);
			} else if (a == b || b == c) {
				prize = 1000 + (b * 100);
			} else if (a == c) {
				prize = 1000 + (a * 100);
			} else {
				prize = Math.max(a, Math.max(b, c)) * 100;
			}
			list.add(prize);
		}
		
		System.out.println(Collections.max(list));
	}

}
