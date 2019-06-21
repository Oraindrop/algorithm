package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ThePartOfWood2947 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		while(!check(list)) {
			for (int i = 0; i < 4; i++) {
				rule(list, i);
			}	
		}
	}

	static boolean check(List<Integer> list) {
		for (int i = 1; i <= 5; i++) {
			if (list.get(i - 1) != i) 
				return false; 
		}
		return true;
	}
	
	static void swap(List<Integer> list, int a, int b) {
		int temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
		
	}
	
	static void printList(List<Integer> list) {
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	static void rule(List<Integer> list, int count) {
		if (list.get(count) > list.get(count + 1)) {
			swap(list, count, count + 1);
			printList(list);
		}
	}
}
