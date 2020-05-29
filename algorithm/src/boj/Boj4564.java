package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj4564 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while(!input.equals("0")) {
			sb.append(go(input)).append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.println(sb.toString());
	}

	static String go(String input) {
		List<Integer> list = new ArrayList<>();
		int answer = Integer.parseInt(input);
		list.add(answer);
		while(answer > 9) {
			answer = calc(input.split(""));
			list.add(answer);
			input = String.valueOf(answer);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i : list) {
			sb.append(i).append(" ");
		}
		return sb.toString();
	}
	
	static int calc(String[] arr) {
		int answer = 1;
		for (int i = 0; i < arr.length; i++) {
			answer *= Integer.parseInt(arr[i]);
		}
		return answer;
	}
}
