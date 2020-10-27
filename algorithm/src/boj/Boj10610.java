package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj10610 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		char[] cArr = br.readLine().toCharArray();
		if (cArr.length == 1) {
			System.out.println(-1);
		} else {
			int sum = 0;
			for (int i = 0; i < cArr.length; i++) {
				int value = (int)(cArr[i] - '0');
				sum += value;
				list.add(value);
			}
			
			list.sort(Collections.reverseOrder());
			
			StringBuilder sb = new StringBuilder();
			if (sum % 3 == 0 && list.get(cArr.length - 1) == 0) {
				for (int i : list) {
					sb.append(i);
				}
			} else {
				sb.append(-1);
			}
			
			System.out.println(sb.toString());
		}
	}


}
