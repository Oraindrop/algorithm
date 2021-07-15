package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj16471 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list1.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list2.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		List<Integer> small = new ArrayList<Integer>(list1.subList(0, (n+1)/2));
		List<Integer> big = new ArrayList<Integer>(list2.subList((n+1)/2 - 1, n));
		
		System.out.println(possibleWin(small, big) ? "YES" : "NO");
	}
	
	static boolean possibleWin(List<Integer> small, List<Integer> big) {
		for (int i = 0; i < small.size(); i++) {
			if (small.get(i) >= big.get(i)) {
				return false;
			}
		}
		return true;
	}

}
