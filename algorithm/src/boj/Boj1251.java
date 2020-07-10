package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj1251 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int size = input.length();
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < size - 1; i++) {
			for (int j = i+1; j < size; j++) {
				String a = input.substring(0, i);
				String b = input.substring(i, j);
				String c = input.substring(j);
				list.add(reverse(a) + reverse(b) + reverse(c));
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}
	
	static String reverse(String s) {
		char[] arr = s.toCharArray();
		String r = "";
		
		for (int i = arr.length - 1; i >= 0; i--) {
			r += arr[i];
		}
		
		return r;
	}

}
