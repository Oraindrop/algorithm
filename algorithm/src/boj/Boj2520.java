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
		double[] arr1 = {8, 8, 4, 1, 9};
		int[] arr2 = {1, 30, 25, 10};
		for (int i = 0; i < t; i++) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			double min = Double.MAX_VALUE;
			
			for (int j = 0; j < 5; j++) {
				double value = Integer.parseInt(st.nextToken()) / arr1[j];
				if (min > value) min = value;
			}
			
			st = new StringTokenizer(br.readLine());
			
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				int value = (int)(Integer.parseInt(st.nextToken())) / arr2[j];
				sum += value;
			}
			
			sb.append(Math.min(sum, (int)(min*16))).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
