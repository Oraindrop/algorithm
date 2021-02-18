package boj;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Boj1524 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List<Integer> sList = new ArrayList<>();
		List<Integer> bList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int j = 0; j < n; j++) {
				sList.add(sc.nextInt());
			}
			
			for (int j = 0; j < m; j++) {
				bList.add(sc.nextInt());
			}
			
			int sMax = Collections.max(sList);
			int bMax = Collections.max(bList);
			
			if (sMax < bMax) {
				sb.append("B");
			} else {
				sb.append("S");
			}
			sb.append(System.lineSeparator());
			
			sList.clear();
			bList.clear();
		}
		
		System.out.print(sb.toString());
		sc.close();
	}

}
