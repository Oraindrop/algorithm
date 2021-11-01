package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj23320 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int percent = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		
		sb.append(n * percent / 100).append(" ");
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] >= min) {
				count++;
			}
		}
		sb.append(count);
		System.out.println(sb.toString());
	}

}
