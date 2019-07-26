package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DontShowCharacterSum3059 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<Character> origin = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			char c = (char)(65 + i);
			origin.add(c);
		}
		
		for (int i = 0; i < t; i++) {
			List<Character> list = new ArrayList<>(origin);
			int sum = 0;
			String s = br.readLine();
			for (char c : s.toCharArray()) {
				list.remove(new Character(c));
			}
			for (char c : list) {
				sum += (int)c;
			}
			System.out.println(sum);
		}
	}

}
