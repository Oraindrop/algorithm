package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj2012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Long.parseLong(br.readLine()));
		}
		
		long sum = 0;
		Collections.sort(list);
		for (int i = 1; i <= n; i++) {
			long a = list.get(i-1);
			long b = (long) i;
			long diff = a-b;
			if (diff < 0) {
				sum += diff * -1;
			} else {
				sum += diff;
			}
		}
		
		System.out.println(sum);
	}

}
