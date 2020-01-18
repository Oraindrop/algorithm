package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class HelmetVest15781 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		List<Long> list = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list.add(Long.parseLong(st.nextToken()));
		}
		
		long a = Collections.max(list);
		list.clear();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			list.add(Long.parseLong(st.nextToken()));
		}
		
		long b = Collections.max(list);
		System.out.println(a+b);
	}

}
