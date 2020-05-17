package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj1032 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}
		
		String basic = list.get(0);
		int size = basic.length();
		String answer = "";
		for (int i = 0; i < size; i++) {
			String temp = basic.substring(i, i+1);
			for (String s : list) {
				if (!temp.equals(s.substring(i, i+1))) {
					temp = "?";
					break;
				}
			}
			answer += temp;
		}
		
		System.out.println(answer);
	}

}
