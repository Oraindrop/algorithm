package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj21918 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < n+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (op == 1) {
				arr[a] = b;
			} else if (op == 2) {
				for (int j = a; j <= b; j++) {
					arr[j] = (arr[j] + 1) % 2;
				}
				
			} else if (op == 3) {
				for (int j = a; j <= b; j++) {
					arr[j] = 0;
				}
			} else if (op == 4) {
				for (int j = a; j <= b; j++) {
					arr[j] = 1;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < n+1; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb.toString());
	}

}
