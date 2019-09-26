package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors4493 {

	static int[] arr = new int[3];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("R S", 1);
		map.put("R P", 2);
		map.put("R R", 0);
		map.put("S P", 1);
		map.put("S R", 2);
		map.put("S S", 0);
		map.put("P R", 1);
		map.put("P S", 2);
		map.put("P P", 0);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[map.get(br.readLine())]++;
			}
			
			int answer = go();
			if (answer == 0) {
				sb.append("TIE");
			} else {
				sb.append(String.format("Player %s", answer));
			}
			sb.append(System.lineSeparator());
			clear();
		}
		
		System.out.println(sb.toString());
	}
	
	static void clear() {
		for (int i = 0; i < 3; i++) {
			arr[i] = 0;
		}
	}
	
	static int go() {
		if (arr[1] > arr[2]) {
			return 1;
		} else if (arr[2] > arr[1]) {
			return 2;
		} 
		return 0;
	}

}
