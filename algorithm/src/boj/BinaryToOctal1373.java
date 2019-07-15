package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BinaryToOctal1373 {

	static Map<String, String> map = new HashMap<>();
	static {
		map.put("000", "0");
		map.put("001", "1");
		map.put("010", "2");
		map.put("011", "3");
		map.put("100", "4");
		map.put("101", "5");
		map.put("110", "6");
		map.put("111", "7");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int padding = s.length() % 3;
		
		if (padding == 2) {
			s = "0" + s;
		} else if (padding == 1) {
			s = "00" + s;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i+=3) {
			sb.append(map.get(s.substring(i, i+3)));
		}
		
		System.out.println(sb.toString());
	}

}
