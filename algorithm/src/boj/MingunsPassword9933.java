package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MingunsPassword9933 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}
		
		String answer = go(list);
		System.out.println(answer.length() + " " + answer.charAt(answer.length()/2));
	}

	private static String go(List<String> list) {
		for (String s : list) {
			String r = new StringBuilder(s).reverse().toString();
			if (list.contains(r)) {
				return s;
			}
		}
		return "";
	}

}
