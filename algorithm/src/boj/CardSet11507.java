package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CardSet11507 {

	static List<String> pList = new ArrayList<>();
	static List<String> kList = new ArrayList<>();
	static List<String> hList = new ArrayList<>();
	static List<String> tList = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 13; i++) {
			pList.add(String.format("P%02d", i));
			kList.add(String.format("K%02d", i));
			hList.add(String.format("H%02d", i));
			tList.add(String.format("T%02d", i));
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String answer = "";
		int size = input.length();
		for (int i = 0; i < size; i += 3) {
			String s = input.substring(i, i+3);
			if (!go(s)) {
				answer = "GRESKA";
				break;
			}
		}
		
		if (answer.isEmpty()) {
			answer += pList.size() + " ";
			answer += kList.size() + " ";
			answer += hList.size() + " ";
			answer += tList.size();
		}
		
		System.out.println(answer);
	}

	static boolean go(String s) {
		if (pList.contains(s)) {
			pList.remove(s);
			return true;
		}
		
		if (kList.contains(s)) {
			kList.remove(s);
			return true;
		}
		
		if (hList.contains(s)) {
			hList.remove(s);
			return true;
		}
		
		if (tList.contains(s)) {
			tList.remove(s);
			return true;
		}
		
		return false;
	}
}
