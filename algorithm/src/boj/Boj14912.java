package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj14912 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int d = Integer.parseInt(input[1]);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < 10; i++) {
			map.put(i, 0);
		}
		
		for (int i = 1; i <= n; i++) {
			String s = String.valueOf(i);
			String[] arr = s.split("");
			for (String e : arr) {
				int number = Integer.parseInt(e);
				map.put(number, map.get(number) + 1);
			}
		}
		
		System.out.println(map.get(d));
	}

}
