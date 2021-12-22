package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj20650 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 7; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		int a = list.get(0);
		int b = list.get(1);
		int c = list.get(6) - a - b;
		System.out.println(a + " " + b + " " + c);
	}

}
