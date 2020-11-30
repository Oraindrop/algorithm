package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1717 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];
		
		for (int i = 0; i <= n; i++) {
			arr[i] = i;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (op == 0) {
				union(arr, a, b);
			} else {
				sb.append(isSame(arr, a, b) ? "YES" : "NO").append(System.lineSeparator());
			}
		}
		
		System.out.print(sb.toString());
	}
	
	static int find(int[] arr, int x) {
		if (x == arr[x]) {
			return x;
		} else {
			return find(arr, arr[x]);
		}
	}
	
	static void union(int[] arr, int a, int b) {
		int pA = find(arr, a);
		int pB = find(arr, b);

		if (pA < pB) {
			arr[pB] = pA;
		} else {
			arr[pA] = pB;
		}
		
	}
	
	static boolean isSame(int[] arr, int a, int b) {
		return arr[find(arr, a)] == arr[find(arr, b)];
	}

}
