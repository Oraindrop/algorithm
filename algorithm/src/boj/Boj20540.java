package boj;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;

public class Boj20540 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("E", "I");
		map.put("S", "N");
		map.put("T", "F");
		map.put("J", "P");
		map.put("I", "E");
		map.put("N", "S");
		map.put("F", "T");
		map.put("P", "J");
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			sb.append(map.get(input.substring(i, i+1)));
		}
		
		System.out.println(sb.toString());
	}

}
