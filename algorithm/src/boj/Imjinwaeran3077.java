package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Imjinwaeran3077 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<String> answers = new ArrayList<>(Arrays.asList(br.readLine().split(" ")));
		List<String> challengers = new ArrayList<>(Arrays.asList(br.readLine().split(" ")));
		List<Integer> converts = new ArrayList<>();
		
		for (String s : challengers) {
			converts.add(answers.indexOf(s));
		}
		
		int answer = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (converts.get(i) < converts.get(j)) answer++;
			}
		}
		
		System.out.println(answer + "/" + (n*(n-1))/2);
	}

}
