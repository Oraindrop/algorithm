package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MiddleLayerWar4435 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] aArr = {1, 2, 3, 3, 4, 10};
		int[] bArr = {1, 2, 2, 2, 3, 5, 10};
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int aSum = 0;
			for (int j = 0; j < 6; j++) {
				aSum += aArr[j] * Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			int bSum = 0;
			for (int j = 0; j < 7; j++) {
				bSum += bArr[j] * Integer.parseInt(st.nextToken());
			}
			
			sb.append(String.format("Battle %s: ", (i+1)));
			
			if (aSum > bSum) {
				sb.append("Good triumphs over Evil");
			} else if (bSum > aSum) {
				sb.append("Evil eradicates all trace of Good");
			} else {
				sb.append("No victor on this battle field");
			}
			
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
		
	}

}
