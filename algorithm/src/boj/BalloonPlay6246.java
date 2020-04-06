package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BalloonPlay6246 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		boolean[] arr = new boolean[n+1];
		
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for (int j = a; j < n+1; j += b) {
				arr[j] = true;
			}
		}
		
		int count = 0;
		for (int i = 1; i < n+1; i++) {
			if (!arr[i]) count++; 
		}
		
		System.out.println(count);
		
	}

}
