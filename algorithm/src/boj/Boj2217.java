package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj2217 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Long.parseLong(br.readLine()));
		}
		
		Collections.sort(list);
		long max = 0;
		
		for (int i = 0; i < n; i++) {
			long value = list.get(i);
			long temp = value * (n-i);
			
			if (temp > max) {
				max = temp;
			}
		}
		
		System.out.println(max);
	}

}
