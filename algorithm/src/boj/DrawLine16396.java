package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DrawLine16396 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[10001];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for (int j = a; j < b; j++) {
				arr[j] = true;
			}
		}
		
		int answer = 0;
		for (int i = 0; i < 10001; i++) {
			if (arr[i]) answer++;
		}
		
		System.out.println(answer);
	}

}
