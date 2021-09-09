package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj16283 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		List<int[]> list = new ArrayList<int[]>();
		for (int i = 1; i < n; i++) {
			if ((a * i + b * (n-i)) == w) {
				int[] arr = {i, n-i};
				list.add(arr);
			}
		}
		
		if (list.size() != 1) {
			System.out.println(-1);
		} else {
			System.out.println(list.get(0)[0] + " " + list.get(0)[1]);
		}
		
	}

}
