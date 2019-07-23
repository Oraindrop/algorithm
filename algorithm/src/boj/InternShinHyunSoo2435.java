package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class InternShinHyunSoo2435 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		List<Integer> answers = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		for (int i = 0; i <= n-k; i++) {
			int sum = 0;
			for (int j = i; j < i+k; j++) {
				sum += list.get(j);
			}
			answers.add(sum);
		}
		
		System.out.println(Collections.max(answers));
	}

}
