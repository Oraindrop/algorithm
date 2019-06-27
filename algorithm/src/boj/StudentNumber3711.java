package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentNumber3711 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			List<Integer> list = new ArrayList<>();
			
			for (int j = 0; j < n; j++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			
			System.out.println(go(list));
		}
	}

	private static int go(List<Integer> list) {
		int max = Collections.max(list);
		for (int i = 1; i <= max; i++) {
			Set<Integer> set = new HashSet<>();
			for (int el : list) {
				set.add(el % i);
			}
			if (set.size() == list.size()) 
				return i;
		}
		return max + 1;
	}

}
