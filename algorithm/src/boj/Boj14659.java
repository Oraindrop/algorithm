package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj14659 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		for (int i = 0; i < n-1; i++) {
			if (n-1 - i < max) {
				break;
			}
			int count = 0;
			for (int j = i+1; j < n; j++) {
				if (arr[i] <= arr[j]) {
					break;
				}
				count++;
			}
			
			max = Math.max(max, count);
		}
		
		System.out.println(max);
	}

}
