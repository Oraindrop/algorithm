package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StringAnalysis10820 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[4];
		map.put(32, 3);
		for (int i = 48; i <= 57; i++) {
			map.put(i, 2);
		}
		for (int i = 65; i <= 90; i++) {
			map.put(i, 1);
		}
		for (int i = 97; i <= 122; i++) {
			map.put(i, 0);
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			try {
				String s = br.readLine();
				s.substring(0, 1);
				for (char c : s.toCharArray()) {
					arr[map.get((int)c)]++;
				}
				
				for (int i = 0; i < 4; i++) {
					sb.append(arr[i]).append(" ");
					arr[i] = 0;
				}
				sb.append(System.lineSeparator());
			} catch(Exception e) {
				break;
			}
		}
		System.out.println(sb.toString());
	}

}
