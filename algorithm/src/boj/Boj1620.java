package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj1620 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<Integer, String> mapIntKey = new HashMap<>();
		Map<String, Integer> mapStringKey = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			String name = br.readLine();
			mapIntKey.put(i, name);
			mapStringKey.put(name, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			String input = br.readLine();
			sb.append(isNumber(input) ? mapIntKey.get(Integer.parseInt(input)) : mapStringKey.get(input)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static boolean isNumber(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
