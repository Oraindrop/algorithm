package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Boj20413 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] base = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Map<String, Integer> map = new HashMap<>();
		map.put("B", 0);
		map.put("S", 1);
		map.put("G", 2);
		map.put("P", 3);
		map.put("D", 3);
		
		String[] input = br.readLine().split("");
		int[] price = new int[n];
		if (input[0].equals("D")) {
			price[0] = base[map.get("D")];
		} else {
			price[0] = base[map.get(input[0])] - 1;
		}
		
		for (int i = 1; i < n; i++) {
			if (input[i].equals("D")) {
				price[i] = base[map.get("D")];
			} else {
				price[i] = base[map.get(input[i])] - price[i-1] - 1;
			}
		}
		
		System.out.println(Arrays.stream(price).sum());
	}
	

}
