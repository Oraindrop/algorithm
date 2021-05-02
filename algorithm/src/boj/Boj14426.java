package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj14426 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<String> checkList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			checkList.add(br.readLine());
		}
		
		List<String> candidates = new ArrayList<String>();
		for (int i = 0; i < m; i++) {
			candidates.add(br.readLine());
		}
		
		for (String s : candidates) {
			int length = s.length();
			
			for (String text : checkList) {
				if (text.length() >= length) {
					if (text.substring(0, length).equals(s)) {
						count++;
						break;
					}
				}
			}
			
		}
		
		System.out.println(count);
		
	}

}

