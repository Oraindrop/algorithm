package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9070 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int minPrice = Integer.MAX_VALUE;
			double min = Double.MAX_VALUE;
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				int weight = Integer.parseInt(st.nextToken());
				int price = Integer.parseInt(st.nextToken());
				double target = (double) price / (double) weight;
				if (target < min) {
					min = target;
					minPrice = price;
				} else if (target == min) {
					if (price < minPrice) {
						min = target;
						minPrice = price;
					}
				}
			}
			sb.append(minPrice).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
