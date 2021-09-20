package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj4299 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = Integer.parseInt(st.nextToken());
		int diff = Integer.parseInt(st.nextToken());
		boolean find = false;
		int a = 0;
		int b = 0;
		for (int i = 0; i <= sum; i++) {
			if (Math.abs(i-(sum-i)) == diff) {
				find = true;
				a = Math.max(i, sum-i);
				b = Math.min(i, sum-i);
				break;
			}
		}
		
		System.out.println(find ? a + " " + b : -1);
	}

}
