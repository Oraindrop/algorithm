package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Radio3135 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int t = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			int temp = Integer.parseInt(br.readLine());
			temp -= b;
			temp = temp < 0 ? temp * -1 : temp;
			list.add(temp);
		}
		
		int min = Collections.min(list);
		min++;
		
		int candidate = a - b < 0 ? (a - b) * -1 : a - b;
		System.out.println(candidate > min ? min : candidate);
		
	}

}
