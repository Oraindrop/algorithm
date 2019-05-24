package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Vote10040 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		arr[0] = 10000;
		
		for (int i = 1; i < n+1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] arr2 = new int[m];
		
		for (int i = 0; i < m; i++) {
			arr2[i] = Integer.parseInt(br.readLine());
		}
		
		int[] vote = new int[n+1];
		
		for (int i : arr2) {
			vote[go(arr, i)]++;
		}
		
		int max = 0;
		int maxIndex = 0;
		
		for (int i = 0; i < vote.length; i++) {
			if (max < vote[i]) {
				max = vote[i];
				maxIndex = i;
			}
		}
		
		System.out.println(maxIndex);
	}
	
	private static int go(int[] arr, int i) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] <= i) 
				return j;
		}
		return 0;
	}

}
