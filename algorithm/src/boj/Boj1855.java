package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj1855 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i <= input.length() - n; i += n) {
			list.add(input.substring(i, i+n));
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < list.size(); j++) {
				if (j % 2 == 0) {
					sb.append(list.get(j).substring(i, i+1));
				} else {
					sb.append(list.get(j).substring(n-1-i, n-i));
				}
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
