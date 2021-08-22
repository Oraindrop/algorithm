package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Boj10175 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Map<String, String> fullNames = new HashMap<String, String>();
		fullNames.put("B", "Bobcat");
		fullNames.put("C", "Coyote");
		fullNames.put("M", "Mountain Lion");
		fullNames.put("W", "Wolf");
		Map<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("B", 2);
		scores.put("C", 1);
		scores.put("M", 4);
		scores.put("W", 3);
		
		for (int i = 0; i < n; i++) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			String[] inputs = br.readLine().split(" ");
			sb.append(inputs[0]);
			
			for (String s : inputs[1].split("")) {
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + scores.get(s));
				} else {
					map.put(s, scores.get(s));
				}
			}
			
			List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
			entryList.sort(Map.Entry.comparingByValue());

			if (entryList.size() > 1 && (entryList.get(entryList.size() - 1).getValue() != entryList.get(entryList.size() - 2).getValue())) {
				sb.append(": The ").append(fullNames.get(entryList.get(entryList.size() - 1).getKey())).append(" is the dominant species").append(System.lineSeparator());
			} else {
				sb.append(": There is no dominant species").append(System.lineSeparator());
			}

		}
		
		System.out.print(sb.toString());
	}

}
