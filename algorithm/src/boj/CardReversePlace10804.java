package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CardReversePlace10804 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i+1);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken());
			
			go(list, start, end);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i : list) {
			sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
				
	}
	
	static void go(List<Integer> list, int start, int end) {
		List<Integer> convert = new ArrayList<>(list.subList(start, end));
		Collections.reverse(convert);
		
		for (int i = start; i < end; i++) {
			list.remove(i);
			list.add(i, convert.get(i - start));
		}
	}

}
