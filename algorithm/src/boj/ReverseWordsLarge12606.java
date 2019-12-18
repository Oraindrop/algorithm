package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWordsLarge12606 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= t; i++) {
			sb.append(String.format("Case #%s: ", i));
			String[] strArr = br.readLine().split(" ");
			for (int j = strArr.length-1; j >= 0; j--) {
				sb.append(strArr[j]).append(" ");
			}
			sb.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}
}
