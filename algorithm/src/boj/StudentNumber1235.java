package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentNumber1235 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}
		
		Set<String> set;
		int answer = 0;
		int size = list.get(0).length();
		for (int i = 1; i < size; i++) {
			set = new HashSet<>();
			for (String s : list) {
				set.add(s.substring(size - i, size));
			}
			if (set.size() == n) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer == 0 ? size : answer);
	}

}
