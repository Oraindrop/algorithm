package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj5576 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list1.add(Integer.parseInt(br.readLine()));
		}
		for (int i = 0; i < 10; i++) {
			list2.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list1);
		Collections.sort(list2);
		
		int a = 0;
		int b = 0;
		for (int i = 7; i < 10; i++) {
			a += list1.get(i);
			b += list2.get(i);
		}
		
		System.out.println(a + " " + b);
	}

}
