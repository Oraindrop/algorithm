package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj5054 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(arr);
			int sum = 0;
			for (int j = 1; j < n; j++) {
				sum += arr[j] - arr[j-1];
			}
			sum += arr[n-1] - arr[0];
			sb.append(sum).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
			
	}

}
