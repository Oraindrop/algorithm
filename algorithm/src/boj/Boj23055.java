package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj23055 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		boolean[][] arr = new boolean[t][t];
		
		for (int i = 0; i < t; i++) {
			arr[0][i] = true;
			arr[i][0] = true;
			arr[t-1][i] = true;
			arr[i][t-1] = true;
			arr[i][i] = true;
			arr[i][t-1-i] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t; j++) {
				sb.append(arr[i][j] ? "*" : " ");
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
		
		
	}

}
