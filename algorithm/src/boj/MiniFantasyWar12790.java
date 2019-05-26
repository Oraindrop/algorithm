package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MiniFantasyWar12790 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			List<Integer> list = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			int a = (list.get(0) + list.get(4)) < 1 ? 1 : list.get(0) + list.get(4);
			int b = (list.get(1) + list.get(5)) < 1 ? 1 : list.get(1) + list.get(5);
			int c = (list.get(2) + list.get(6)) < 0 ? 0 : list.get(2) + list.get(6);
			int d = list.get(3) + list.get(7);
			
			int answer = a + (5 * b) + (2 * c) + (2 * d);
			System.out.println(answer);
		}
	}

}
