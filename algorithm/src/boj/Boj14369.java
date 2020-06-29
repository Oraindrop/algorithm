package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj14369 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] keyArr = {"Z", "X", "U", "F", "G", "H", "W", "I", "S", "N"};
		int[] valueArr = {0, 6, 4, 5, 8, 3, 2, 9, 7, 1};
		String[] alphaArr =  {"ZERO", "SIX", "FOUR", "FIVE", "EIGHT", "THREE", "TWO", "NINE", "SEVEN", "ONE"};
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			String input = br.readLine();
			List<Integer> list = new ArrayList<>();
			
			for (int j = 0; j < 10; j++) {
				while (input.contains(keyArr[j])) {
					list.add(valueArr[j]);
					String[] arr = alphaArr[j].split("");
					for (String s : arr) {
						int index = input.indexOf(s);
						String temp = input.substring(0, index) + input.substring(index+1, input.length());
						input = temp;
					}
				}
			}
			
			Collections.sort(list);
			sb.append("Case #").append((i+1)).append(": ");
			for (int k : list) {
				sb.append(k);
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
