package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11637 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			int max = 0;
			int maxIndex = -1;
			int sum = 0;
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(br.readLine());
				sum += arr[j];
				if (max < arr[j]) {
					max = arr[j];
					maxIndex = j;
				}
			}
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j] == max) {
					count++;
				}
			}
			
			if (count > 1) {
				sb.append("no winner");
			} else {
				if (max > (sum / 2)) {
					sb.append("majority ");
				} else {
					sb.append("minority ");
				}
				sb.append("winner ").append((maxIndex+1));
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	
}
