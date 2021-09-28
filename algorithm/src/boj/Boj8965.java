package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj8965 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			List<String> list = new ArrayList<>();
			String input = br.readLine();
			list.add(input);
			for (int j = 1; j < input.length(); j++) {
				list.add(input.substring(j) + input.substring(0, j));
			}
			Collections.sort(list);
			sb.append(list.get(0)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
