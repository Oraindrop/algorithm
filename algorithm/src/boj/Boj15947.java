package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Boj15947 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> tururu = new HashSet<>();
		tururu.add("tururu");
		tururu.add("turu");
		String[] arr = {"baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu", "in", "bed", "tururu", "turu", "baby", "sukhwan"};
		
		String s = arr[(n-1) % 14];
		if (tururu.contains(s)) {
			int size = n / 14;
			if (s.equals("tururu") && size >= 3) {
				System.out.println("tu+ru*"+(size+2));
			} else if (s.equals("turu") && size >= 4) {
				System.out.println("tu+ru*"+(size+1));
			} else {
				for (int i = 0; i < size; i++) {
					s += "ru";
				}
				System.out.println(s);
			}
		} else {
			System.out.println(s);
		}
	}

}
