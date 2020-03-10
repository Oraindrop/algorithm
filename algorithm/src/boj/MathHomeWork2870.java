package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MathHomeWork2870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<BigInteger> list = new ArrayList<>();
		String input = "";
		for (int i = 0; i < n; i++) {
			input = br.readLine();
			input += 'a';
			String temp = "";
			for (char c : input.toCharArray()) {
				if (c >= 'a' && c <= 'z') {
					if (!temp.isEmpty()) {
						list.add(new BigInteger(temp));
						temp = "";
					}
				} else {
					temp += c;
				}
			}
		}
		Collections.sort(list);
		for (BigInteger i : list) {
			System.out.println(i);
		}
	}

}
