package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MarsMath5355 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			double value = Double.parseDouble(st.nextToken());
			while (st.hasMoreTokens()) {
				value = go(value, st.nextToken());
			}
			sb.append(String.format("%.02f", value)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static double go (double value, String op) {
		if (op.equals("@")) {
			return value * 3;
		} else if (op.equals("%")) {
			return value + 5;
		} else if (op.equals("#")) {
			return value - 7;
		}
		return value;
	}

}
