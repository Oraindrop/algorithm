package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2960 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(go(n, k));

	}
	
	static int go(int n, int k) {
		boolean arr[] = new boolean[n+1];

		int count = 0;
		
		for (int i = 2; i <= n; i++) {
			if (!arr[i]) {
				arr[i] = true;
				count++;
				if (count == k) {
					return i;
				}
				for (int j = i*i; j <= n; j += i) {
					if (!arr[j]) {
						arr[j] = true;
						count++;
						if (count == k) {
							return j;
						}	
					}
				}	
			}
		}
		
		return 0;
	}

}
