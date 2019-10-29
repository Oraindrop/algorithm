package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SequenceAndQueryTwentyOne16975 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int z = 0; z < m; z++) {
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			if (op == 1) {
				int i = Integer.parseInt(st.nextToken());
				int j = Integer.parseInt(st.nextToken());
				int k = Integer.parseInt(st.nextToken());
				
				for (int x = i; x <= j; x++) {
					arr[x] += k;
				}
			} else {
				int x = Integer.parseInt(st.nextToken());
				sb.append(arr[x]).append(System.lineSeparator());
			}
		}
		
		System.out.print(sb.toString());
	}

}
