package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasketBall1159 {

	public static int[] arr = new int[26];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			arr[s.charAt(0) - 97]++;
		}

		String answer = getAnswer();
		if (answer.equals("")) {
			System.out.println("PREDAJA");
		} else {
			System.out.println(answer);
		}
	}
	
	private static String getAnswer() {
		String answer = "";
		for (int i = 0; i < 26; i++) {
			if (arr[i] >= 5) {
				char c = (char) (i + 97);
				answer += c;				
			}
		}
		return answer;
	}

}
