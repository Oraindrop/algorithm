package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JealousyJinSeo15784 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][n+1];
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		String answer = go(arr, a, b, n) ? "HAPPY" : "ANGRY";
		System.out.println(answer);
	}
	
	static boolean go(int[][] arr, int a, int b, int n) {
		int base = arr[a][b];
		
		for (int i = 1; i <= n; i++) {
			if (arr[a][i] > base)
				return false;
			if (arr[i][b] > base)
				return false;
		}
		return true;
	}

}
