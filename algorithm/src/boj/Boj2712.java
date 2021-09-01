package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2712 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			double number = Double.parseDouble(st.nextToken());
			String op = st.nextToken();
			
			if (op.equals("kg")) {
				sb.append(String.format("%.4f", number * 2.2046)).append(" lb");
			} else if (op.equals("lb")) {
				sb.append(String.format("%.4f", number * 0.4536)).append(" kg");
			} else if (op.equals("l") ) {
				sb.append(String.format("%.4f", number * 0.2642)).append(" g");
			} else {
				sb.append(String.format("%.4f", number * 3.7854)).append(" l");
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
		
	}

}
