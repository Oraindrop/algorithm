package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SuperStarK2865 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		double[] arr = new double[n+1];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int user = Integer.parseInt(st.nextToken());
				double score = Double.parseDouble(st.nextToken());
				arr[user] = arr[user] < score ? score : arr[user];
			}
		}

		double answer = 0.0;
		
		Arrays.sort(arr);
		
		for (int i = n; i > n - k; i--) {
			answer += arr[i];
		}
		
		System.out.println(String.format("%.1f", answer));
	}

}
