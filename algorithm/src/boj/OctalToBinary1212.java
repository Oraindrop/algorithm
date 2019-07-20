package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OctalToBinary1212 {

	static Map<String, String> map = new HashMap<>();
	static {
		map.put("0", "000");
		map.put("1", "001");
		map.put("2", "010");
		map.put("3", "011");
		map.put("4", "100");
		map.put("5", "101");
		map.put("6", "110");
		map.put("7", "111");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int size = s.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(map.get(s.substring(i, i+1)));
		}
		
		String answer = sb.toString();
		int index = 0;
		
		for (int i = 0; i < answer.length(); i++) {
			if (answer.substring(i, i+1).equals("0")) {
				index++;
			}
			else {
				break;
			}
		}
		if (index == answer.length()) {
			answer = "0";
		} else {
			answer = answer.substring(index, answer.length());	
		}
		
		System.out.println(answer);
	}

}
