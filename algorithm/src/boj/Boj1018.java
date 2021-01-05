package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1018 {
	static char[][] white = new char[8][8];
	static char[][] black = new char[8][8];
	static char[] whiteFirst = "WBWBWBWB".toCharArray();
	static char[] blackFirst = "BWBWBWBW".toCharArray();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 0) {
				white[i] = whiteFirst;
				black[i] = blackFirst;
			} else {
				white[i] = blackFirst;
				black[i] = whiteFirst;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] input = new char[n][m];
		for (int i = 0; i < n; i++) {
			input[i] = br.readLine().toCharArray();
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < n-7; i++) {
			for (int j = 0; j < m-7; j++) {
				int value = calculate(i, j, input);
				if (value < min) {
					min = value;
				}
			}
		}
		
		System.out.println(min);
	}
	
	static int calculate(int n, int m, char[][] input) {
		int whiteCount = 0;
		int blackCount = 0;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (white[i][j] != input[i+n][j+m]) {
					whiteCount++;
				}
				
				if (black[i][j] != input[i+n][j+m]) {
					blackCount++;
				}
			}
		}
		
		return Math.min(whiteCount, blackCount);
	}

}
