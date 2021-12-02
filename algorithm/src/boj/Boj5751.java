package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj5751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while (t > 0) {
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[2];
			for (int i = 0; i < t; i++) {
				int number = Integer.parseInt(st.nextToken());
				arr[number]++;
			}
			sb.append("Mary won ").append(arr[0]).append(" times and John won ").append(arr[1]).append(" times").append(System.lineSeparator());
			t = Integer.parseInt(br.readLine());
		}
		
		System.out.print(sb.toString());
	}

}
