package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj13300 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr1 = new int[7];
		int[] arr2 = new int[7];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			if (a == 0) {
				arr1[Integer.parseInt(st.nextToken())]++;
			} else {
				arr2[Integer.parseInt(st.nextToken())]++;
			}
		}
		
		int answer = 0;
		
		for (int i = 1; i < 7; i++) {
			answer += arr1[i] / k;
			if (arr1[i] % k != 0) {
				answer++;
			}
			
			answer += arr2[i] / k;
			if (arr2[i] % k != 0) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
