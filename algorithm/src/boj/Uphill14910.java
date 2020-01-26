package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Uphill14910 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		System.out.println(go(list));
		
	}
	
	static String go(List<Integer> list) {

		for (int i = 0; i < list.size() - 1; i++) {
			int pre = list.get(i);
			int post = list.get(i+1);
			if (pre > post) return "Bad";
		}
		
		return "Good";
	}

}
