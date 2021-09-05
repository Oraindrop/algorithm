package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj1333 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int size = n*l + (n-1)*5;
		List<Boolean> list = new ArrayList<>();
		
		if (d >= size) {
			System.out.println(d);
		} else {
			for (int i = 0; i < n-1; i++) {
				for (int j = 0; j < l; j++) {
					list.add(false);
				}
				
				for (int j = 0; j < 5; j++) {
					list.add(true);
				}
			}
			
			for (int i = 0; i < l; i++) {
				list.add(false);
			}
			

			int find = d;
			while (true) {
				if (find >= size || list.get(find)) {
					break;
				}
				find += d;
			}
			System.out.println(find);
		}
		
	}

}
