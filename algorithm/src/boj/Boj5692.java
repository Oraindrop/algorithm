package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj5692 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Map<Integer, Integer> facMap = new HashMap<>();
		facMap.put(1, 1);
		for (int i = 2; i <= 5; i++) {
			facMap.put(i, facMap.get(i-1) * i);
		}
		StringBuilder sb = new StringBuilder();
		while (!input.equals("0")) {
			int n = Integer.parseInt(input);
			int answer = 0;
			int index = 1;
			while (n > 0) {
				answer += (n % 10) * facMap.get(index);
				index++;
				n /= 10;
			}
			sb.append(answer).append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.print(sb.toString());
	}

}
