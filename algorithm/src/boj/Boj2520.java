package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2520 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		double[] arr1 = {2.0, 2.0, 0.25, 0.065, 0.5625};
		int[] arr2 = {1, 30, 25, 10};
		for (int i = 0; i < t; i++) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			int min = Integer.MAX_VALUE;
			
			for (int j = 0; j < 5; j++) {
				int value = (int)(Integer.parseInt(st.nextToken()) / arr1[j]);
				System.out.println(value);
				if (min > value) min = value;
			}
			
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 4; j++) {
				int value = (int)(Integer.parseInt(st.nextToken())) / arr2[j];
				if (min > value) min = value;
			}
			
			sb.append(min);
		}
		
		System.out.print(sb.toString());
	}

}
