package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OctalNumber2998 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Map<String, String> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		map.put("000", "0");
		map.put("001", "1");
		map.put("010", "2");
		map.put("011", "3");
		map.put("100", "4");
		map.put("101", "5");
		map.put("110", "6");
		map.put("111", "7");
		
		while (s.length() % 3 != 0) {
			s = "0" + s;
		}
		
		for(int i = 0; i < s.length(); i+=3) {
			sb.append(map.get(s.substring(i, i+3)));
		}
		
		System.out.println(sb.toString());
	}

}
