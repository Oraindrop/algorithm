package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddNumber2576 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input % 2 == 1) {
				list.add(input);
			}
		}
		
		if (list.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(list.stream().reduce(0, Integer::sum));
			System.out.println(Collections.min(list));
		}
	}

}
