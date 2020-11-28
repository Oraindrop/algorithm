package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj20205 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int y = 0; y < k; y++) {
				for (int j = 0; j < n; j++) {
					for (int x = 0; x < k; x++) {
						sb.append(arr[i][j]).append(" ");	
					}
				}
				sb.append(System.lineSeparator());
			}
		}
		
		System.out.println(sb.toString());
	}

}
