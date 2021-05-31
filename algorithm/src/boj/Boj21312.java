package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj21312 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(a*b);
		list.add(a*c);
		list.add(b*c);
		list.add(a*b*c);
		Collections.sort(list);
		System.out.println(go(list));
	}
	
	static int go(List<Integer> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) % 2 == 1) {
				return list.get(i);
			}
		}
		return list.get(list.size() - 1);
	}

}
