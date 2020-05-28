package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3449 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String a = br.readLine();
			String b = br.readLine();
			sb.append("Hamming distance is ").append(diff(a, b)).append(".").append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

	static int diff (String a, String b) {
		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (aArr[i] != bArr[i])
				count++;
		}
		return count;
	}
}
