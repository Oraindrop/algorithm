package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj12788 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int needCount = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());
			list.add(value);
			sum += value;
		}
		
		Collections.sort(list);
		
		if (needCount > sum) {
			System.out.println("STRESS");
		} else if (needCount == sum) {
			System.out.println(n);
		} else {
			System.out.println(go(list, needCount));
		}
	}
	
	static int go(List<Integer> list, int needCount) {
		int sum = 0;
		for (int i = 1; i <= list.size(); i++) {
			sum += list.get(list.size() - i);
			if (sum >= needCount) {
				return i;
			}
		}
		// untouchable
		return list.size();
	}

}
