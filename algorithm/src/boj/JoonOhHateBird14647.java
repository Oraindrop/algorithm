package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class JoonOhHateBird14647 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int count = 0;
				String s = st.nextToken();
				for (char c : s.toCharArray()) {
					if (c == '9') count++;
				}
				arr[i][j] = count;
			}
		}
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				sum += arr[i][j];
			}
			list.add(sum);
		}
		
		int total = 0;
		for (int i : list) {
			total += i;
		}
		
		for (int j = 0; j < m; j++) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += arr[i][j];
			}
			list.add(sum);
		}
		
		System.out.println(total - Collections.max(list));
		
	}

}
