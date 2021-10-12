package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj1485 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			List<String[]> list = new ArrayList<String[]>();
			for (int j = 0; j < 4; j++) {
				list.add(br.readLine().split(" "));
			}
			
			List<Long> sorted = new ArrayList<Long>();

			for (int j = 0; j < 3; j++) {
				int x1 = Integer.parseInt(list.get(j)[0]);
				int y1 = Integer.parseInt(list.get(j)[1]);
				for (int k = j+1; k < 4; k++) {
					int x2 = Integer.parseInt(list.get(k)[0]);
					int y2 = Integer.parseInt(list.get(k)[1]);
					sorted.add(((long)(x1 - x2) * (long)(x1 - x2)) + ((long)(y1 - y2) * (long)(y1 - y2)));
				}
			}
			
			Collections.sort(sorted);
			if (sorted.get(0) == sorted.get(1) && sorted.get(1) == sorted.get(2) && sorted.get(2) == sorted.get(3) && sorted.get(4) == sorted.get(5)) {
				sb.append(1).append(System.lineSeparator());
			} else {
				sb.append(0).append(System.lineSeparator());
			}
		}
		System.out.println(sb.toString());
		
	}

}
