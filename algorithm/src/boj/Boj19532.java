package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj19532 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();
		
		for (int x = -999; x < 1000; x++) {
			for (int y = -999; y < 1000; y++) {
				if ((a * x) + (b * y) == c) {
					xList.add(x);
					yList.add(y);
				}
			}
		}
		
		for (int i = 0; i < xList.size(); i++) {
			int x = xList.get(i);
			int y = yList.get(i);
			
			if ((d * x) + (e * y) == f) {
				System.out.println(x + " " + y);
				break;
			}
		}
	}

}
