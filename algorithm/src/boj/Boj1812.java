package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj1812 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		int a2 = 0;
		
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				a2 += list.get(i);
			} else {
				a2 -= list.get(i);
			}
		}
		
		List<Integer> answers = new ArrayList<>();
		answers.add(a2/2);
		
		for (int i = 0; i < n-1; i++) {
			answers.add(list.get(i) - answers.get(i));
		}
		
		for (int i : answers) {
			System.out.println(i);
		}
	}

}
