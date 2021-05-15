package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9184 {

	static int[][][] arr = new int[21][21][21];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		while (a != -1 || b != -1 || c != -1) {
			sb.append(String.format("w(%d, %d, %d) = %d", a, b, c, go(a, b, c))).append(System.lineSeparator());
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
		}

		System.out.print(sb.toString());
	}
	
	static int go(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		
		if (a > 20 || b > 20 || c > 20) {
			if (arr[20][20][20] == 0) {
				arr[20][20][20] = go(20, 20, 20);
			}
			
			return arr[20][20][20];
		}
		
		if (a < b && b < c) {
			if (arr[a][b][c] == 0) {
				arr[a][b][c] = go(a, b, c-1) + go(a, b-1, c-1) - go(a, b-1, c);
			}
			
			return arr[a][b][c];
		}
		
		if (arr[a][b][c] == 0) {
			arr[a][b][c] = go(a-1, b, c) + go(a-1, b-1, c) + go(a-1, b, c-1) - go(a-1, b-1, c-1);
		}
		
		return arr[a][b][c]; 
	}
	

}
