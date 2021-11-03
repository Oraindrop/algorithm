package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj23292 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String baseDate = br.readLine();
		int n = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}
		
		Collections.sort(list);
		
		int max = 0;
		String answer = "";
		
		for (String s : list) {
			int yyyy = 0;
			for (int i = 0; i < 4; i++) {
				yyyy += pow(charToInt(baseDate.charAt(i))-charToInt(s.charAt(i)));
			}
			int mm = 0;
			for (int i = 4; i < 6; i++) {
				mm += pow(charToInt(baseDate.charAt(i))-charToInt(s.charAt(i)));
			}
			int dd = 0;
			for (int i = 6; i < 8; i++) {
				dd += pow(charToInt(baseDate.charAt(i))-charToInt(s.charAt(i)));
			}
			int result = yyyy * mm * dd;
			if (max < result) {
				max = result;
				answer = s;
			}
		}
		
		System.out.println(answer);
		
	}
	
	private static int charToInt(char c) {
		return (int)(c - '0');
	}
	
	private static int pow(int number) {
		return number * number;
	}

}
