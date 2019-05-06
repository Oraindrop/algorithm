package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DisplayTrophy1668 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		List<Integer> lefts = new ArrayList<>();
		List<Integer> rights = new ArrayList<>();
		
		lefts.add(list.get(0));
		
		for (int i = 1; i < n; i++) {
			int left = lefts.get(lefts.size() - 1);
			if (left < list.get(i)) {
				lefts.add(list.get(i));
			}
		}
		
		rights.add(list.get(n - 1));
		for (int i = n - 2; i >= 0; i--) {
			int right = rights.get(rights.size() - 1);
			if (right < list.get(i)) {
				rights.add(list.get(i));
			}
		}
		
		System.out.println(lefts.size());
		System.out.println(rights.size());
	}

}
