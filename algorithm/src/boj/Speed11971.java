package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Speed11971 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		List<Integer> limits = new ArrayList<>();
		List<Integer> speeds = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			for (int j = 0; j < a; j++) {
				limits.add(value);
			}
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			for (int j = 0; j < a; j++) {
				speeds.add(value);
			}
		}
		
		int max = 0;
		
		for (int i = 0; i < limits.size(); i++) {
			int value = speeds.get(i) - limits.get(i);
			if (value > 0 && value > max) {
				max = value;
			}
		}
		
		System.out.println(max);
	}

}
