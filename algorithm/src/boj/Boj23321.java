package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj23321 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = new String[5];
		for (int i = 0; i < 5; i++) {
			inputs[i] = br.readLine();
		}
		
		List<String> list = new ArrayList<>();
		int size = inputs[0].length();
		
		for (int i = 0; i < size; i++) {
			String s = "";
			for (int j = 0; j < 5; j++) {
				s += inputs[j].charAt(i);
			}
			if (s.equals(".omln")) {
				list.add("owln.");
			} else if (s.equals("owln.")) {
				list.add(".omln");
			} else {
				list.add(s);	
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < size; j++) {
				sb.append(list.get(j).charAt(i));
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
		
		
	}

}
