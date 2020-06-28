package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arrPlus = new int[1000001];
		int[] arrMinus = new int[1000001];
		
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(br.readLine());
			if (value < 0) {
				arrMinus[(value) * -1]++;
			} else {
				arrPlus[value]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1000000; i > 0; i--) {
			if (arrMinus[i] != 0) {
				sb.append((i * -1)).append(System.lineSeparator());
			}
		}
		
		for (int i = 0; i < 1000001; i++) {
			if (arrPlus[i] != 0) {
				sb.append(i).append(System.lineSeparator());
			}
		}
		
		System.out.print(sb.toString());
	}

}
