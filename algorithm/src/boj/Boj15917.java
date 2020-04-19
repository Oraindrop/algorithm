package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Boj15917 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		List<Long> list = new ArrayList<>();
		list.add(1l);
		for (int i = 1; i < 31; i++) {
			list.add(list.get(i-1) * 2);
		}
		
		Set<Long> set = new HashSet<>(list);
		
		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(br.readLine());
			sb.append(set.contains(a) ? "1" : "0").append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
