package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] answers = new int[10];
		
		for (int i = 0; i < 10; i++) {
			answers[i] = (i % 5) + 1;
		}
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int[] arr = new int[10];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 10; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			if (isEquals(answers, arr)) {
				sb.append((i+1)).append(System.lineSeparator());
			}
		}
		System.out.print(sb.toString());
	}
	
	static boolean isEquals(int[] arr1, int[] arr2) {
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return true;
	}

}
