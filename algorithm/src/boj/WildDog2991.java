package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class WildDog2991 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int ab = a + b;
		int cd = c + d;
		for (int i : list) {
			int answer = 0;
			int modA = i % ab;
			if (modA >= 1 && modA <= a) answer++;
			int modC = i % cd;
			if (modC >= 1 && modC <= c) answer++;
			System.out.println(answer);
		}
	}

}
