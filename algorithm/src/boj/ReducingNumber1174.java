package boj;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;

public class ReducingNumber1174 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Long> list = new ArrayList<>();
		
		for (int i = 1; i < 1024; i++) {
			long number = 0;
			for (int j = 9; j >= 0; j--) {
				if ((i & (1 << j)) != 0) {
					number = number * 10 + j;
				}
			}
			list.add(number);
		}
		Collections.sort(list);
		System.out.println(n > 1023 ? "-1" : list.get(n-1));
	}

}
