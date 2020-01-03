package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class IWillPay18229 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			int index = m+1;
			for (int j = 1; j < m+1; j++) {
				sum += Integer.parseInt(st.nextToken());
				if (sum >= k) {
					index = j;
					break;
				}
			}
			list.add(index);
		}
		
		int min = Collections.min(list);
		int answer = list.indexOf(new Integer(min)) + 1;
		System.out.println(answer + " " + min);
	}

}
