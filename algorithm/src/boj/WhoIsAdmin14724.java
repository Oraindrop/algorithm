package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class WhoIsAdmin14724 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String[] arr = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
		List<Integer> list = new ArrayList<>();
		List<Integer> maxs = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			list.clear();
			for (int j = 0; j < n; j++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			maxs.add(Collections.max(list));
		}
		
		int max = Collections.max(maxs);
		System.out.println(arr[maxs.indexOf(new Integer(max))]);
	}

}
