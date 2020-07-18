package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj3985 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[l+1];
		int[] counts = new int[n+1];
		
		int expectMax = 0;
		int expectMaxIndex = 0;
		
		StringTokenizer st;
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int expect = b - a + 1;
			if (expectMax < expect) {
				expectMax = expect;
				expectMaxIndex = i;
			}
			
			int count = 0;
			for (int j = a; j <= b; j++) {
				if (arr[j] == 0) {
					arr[j] = i;
					count++;
				}
			}
			counts[i] = count;
		}
		
		int max = 0;
		int maxIndex = 0;
		for (int i = 1; i <= n; i++) {
			if (max < counts[i]) {
				max = counts[i];
				maxIndex = i;
			}
		}
		
		System.out.println(expectMaxIndex);
		System.out.println(maxIndex);
	}

}
