package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj14563 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(st.nextToken());
			Set<Integer> set = new HashSet<Integer>();
			for (int j = 1; j <= n/2; j++) {
				if (n % j == 0) {
					set.add(j);
					set.add(n/j);
				}
			}
			
			int sum = set.stream().mapToInt(k -> k).sum();
			sum -= n;
			
			if (sum == n) {
				sb.append("Perfect");
			} else if (sum < n) {
				sb.append("Deficient");
			} else {
				sb.append("Abundant");
			}
			
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
