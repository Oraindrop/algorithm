package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj18129 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String input = st.nextToken().toLowerCase();
		int k = Integer.parseInt(st.nextToken());
		
		char pre = ' ';
		int count = 0;
		char[] arr = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < arr.length; i++) {
			if (pre != arr[i]) {
				if (count != 0 && !set.contains(pre)) {
					sb.append(count >= k ? "1" : "0");
					set.add(pre);
				}
				pre = arr[i];
				count = 1;
			} else {
				count++;
			}
		}
		
		if (!set.contains(pre)) {
			sb.append(count >= k ? "1" : "0");
		}
		System.out.println(sb.toString());
		
	}

}
