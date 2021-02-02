package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj12782 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] arr = new int[2];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			char[] a = st.nextToken().toCharArray();
			char[] b = st.nextToken().toCharArray();
			clear(arr);
			
			for (int j = 0; j < a.length; j++) {
				if (a[j] != b[j]) {
					arr[a[j] - '0']++;
				}
			}
			
			int min = Math.min(arr[0], arr[1]);
			sb.append(arr[0] + arr[1] - min).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static void clear(int[] arr) {
		arr[0] = 0;
		arr[1] = 0;
	}

}
