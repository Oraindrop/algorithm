package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj23027 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String answer = s;
		if (s.contains("A")) {
			answer = answer.replaceAll("B", "A");
			answer = answer.replaceAll("C", "A");
			answer = answer.replaceAll("D", "A");
			answer = answer.replaceAll("F", "A");
		} else if (s.contains("B")) {
			answer = answer.replaceAll("C", "B");
			answer = answer.replaceAll("D", "B");
			answer = answer.replaceAll("F", "B");
		} else if (s.contains("C")) {
			answer = answer.replaceAll("D", "C");
			answer = answer.replaceAll("F", "C");
		} else {
			answer = "";
			for (int i = 0; i < s.length(); i++) {
				answer += "A";
			}
		}
		
		System.out.println(answer);
	}

}
