package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj17247 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int value = Integer.parseInt(st.nextToken());
				if (value == 1) {
					xList.add(i);
					yList.add(j);
				}
			}
		}
		
		int answer = Math.abs(xList.get(1) - xList.get(0)) + Math.abs(yList.get(1) - yList.get(0));
		System.out.println(answer);
	}

}
