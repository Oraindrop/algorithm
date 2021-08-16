package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj5176 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			st.nextToken();
			Set<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < p; j++) {
				set.add(Integer.parseInt(br.readLine()));
			}
			sb.append(p - set.size()).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
