package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PCRoom1453 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= 100; i++) {
			list.add(i);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 0;
		for (int i = 0; i < t; i++) {
			Integer n = Integer.parseInt(st.nextToken());
			if (list.contains(n)) {
				list.remove(n);
			} else {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
