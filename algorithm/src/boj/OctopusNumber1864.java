package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OctopusNumber1864 {
	static Map<String, Long> map;
	
	static {
		map = new HashMap<>();
		map.put("-", (long)0);
		map.put("\\", (long)1);
		map.put("(", (long)2);
		map.put("@", (long)3);
		map.put("?", (long)4);
		map.put(">", (long)5);
		map.put("&", (long)6);
		map.put("%", (long)7);
		map.put("/", (long)-1);
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while(!input.equals("#")) {
			sb.append(go(input)).append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.println(sb.toString());
	}
	
	static long go(String input) {
		String[] arr = input.split("");
		int size = arr.length;
		long answer = 0;
		for (int i = 0; i < size; i++) {
			answer += map.get(arr[i]) * Math.pow(8, size-1-i);
		}
		return answer;
	}

}
