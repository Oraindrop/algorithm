package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaseBall10214 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[] arr1 = new int[9];
		int[] arr2 = new int[9];
		
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < 9; j++) {
				st = new StringTokenizer(br.readLine());
				arr1[j] = Integer.parseInt(st.nextToken());
				arr2[j] = Integer.parseInt(st.nextToken());
			}
			int sum1 = sumArr(arr1);
			int sum2 = sumArr(arr2);
			
			if (sum1 > sum2) {
				sb.append("Yonsei");
			} else if (sum2 > sum1) {
				sb.append("Korea");
			} else {
				sb.append("Draw");
			}
			
			sb.append(System.lineSeparator());
		}
		
		System.out.println(sb.toString());
	}

	static int sumArr(int[] arr) {
		int answer = 0;
		for (int i : arr) {
			answer += i;
		}
		return answer;
	}
	
}
