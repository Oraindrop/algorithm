package boj;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class Boj9037 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < t; j++) {

			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			int[] temp = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int count = 0;
			makeEven(arr);
			
			while (!isSame(arr)) {
				for (int i = 0; i < n; i++) {
					if (i == n-1) {
						arr[i] = arr[i] / 2;
						temp[0] = arr[i];
					} else {
						arr[i] = arr[i] / 2;
						temp[i+1] = arr[i];	
					}
				}
				
				for (int i = 0; i < n; i++) {
					arr[i] += temp[i];
				}
				
				makeEven(arr);
				count++;
			}
			
			sb.append(count).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static void makeEven(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				arr[i]++;
			}
		}
	}
	
	static boolean isSame(int[] arr) {
		int pre = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (pre != arr[i]) {
				return false;
			}
			
			pre = arr[i];
		}
		return true;
	}

}
