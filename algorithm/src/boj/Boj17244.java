package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj17244 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<int[]> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		}
		
		int answer = 0;
		long level2Count = list.stream().filter(a -> a[1] <= l).count();
		if (level2Count >= k) {
			answer = k * 140;
		} else {
			answer = (int)level2Count * 140;
			int level1Count = (int)list.stream().filter(a -> a[1] > l && a[0] <= l).count();
			level1Count = level1Count > k - level2Count ? k - (int)level2Count : level1Count;
			answer += level1Count * 100;
		}
		
		System.out.println(answer);
	}

}
