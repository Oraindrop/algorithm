package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SumOfOddSequence9713 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>(); 
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 1) sum += j;
			}
			list.add(sum);
		}
		
		for (int i : list) {
			System.out.println(i);
		}
				
	}

}
