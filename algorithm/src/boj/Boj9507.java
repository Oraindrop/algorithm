package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9507 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		long[] arr = new long[68];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for (int i = 4; i < 68; i++) {
			arr[i] = arr[i-4] + arr[i-3] + arr[i-2] + arr[i-1];
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(arr[n]).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
