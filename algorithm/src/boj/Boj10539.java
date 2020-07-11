package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10539 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[t];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] answers = new int[t];
		answers[0] = arr[0];
		for (int i = 1; i < t; i++) {
			answers[i] = ((i+1) * arr[i]) - sum(answers, i-1);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			sb.append(answers[i]).append(" ");
		}
		System.out.println(sb.toString());
	}
	
	static int sum(int[] arr, int index) {
		int sum = 0;
		for (int i = 0; i <= index; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
