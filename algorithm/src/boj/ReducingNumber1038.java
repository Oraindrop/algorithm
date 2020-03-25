package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReducingNumber1038 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Long> list = new ArrayList<>();
		for (int i = 1; i < 1024; i++) {
			long num = 0;
			for (int j = 9; j >= 0; j--) {
				if ((i & (1 << j)) != 0) {
					num = num * 10 + j;
				}
			}
			list.add(num);
		}
		
		Collections.sort(list);
		System.out.println(n >= list.size() ? "-1" : list.get(n));
	}

}
