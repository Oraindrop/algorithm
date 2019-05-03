package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Doubles4641 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		while(!s.equals("-1")) {
			StringTokenizer st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken());
			int answer = 0;
			
			List<Integer> list = new ArrayList<>();
			while (n != 0) {
				list.add(n);
				n = Integer.parseInt(st.nextToken());
			}
			Collections.sort(list);
			
			for (int i : list) {
				if (i % 2 == 0) {
					if (list.contains(i/2)) answer++;
				}
			}
			
			System.out.println(answer);
			s = br.readLine();
		}
		
	}

}
