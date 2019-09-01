package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RoughSum8949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		
		if (b.length() > a.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		
		int diff = b.length() - a.length();
		int aNumber = Integer.parseInt(a);
		int bNumber = Integer.parseInt(b);
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length(); i++) {
			list.add(0, (aNumber % 10) + (bNumber % 10));
			aNumber /= 10;
			bNumber /= 10;
		}
		
		for (int i = 0; i < diff; i++) {
			list.add(0, Integer.parseInt(b.substring(i, i+1)));
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i : list) {
			sb.append(i);
		}
		
		System.out.println(sb.toString());
		
	}

}
