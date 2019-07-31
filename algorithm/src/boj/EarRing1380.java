package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class EarRing1380 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int test = 1;
		int n = Integer.parseInt(br.readLine());
		Map<Integer, String> map;
		
		while (n != 0) {
			map = new HashMap<>();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
				map.put(i, br.readLine());
			}
			sum *= 2;
			
			int sum2 = 0;
			for (int i = 0; i < (2*n - 1); i++) {
				sum2 += Integer.parseInt(br.readLine().split(" ")[0]);
			}
			sb.append(test).append(" ").append(map.get(sum - sum2)).append(System.lineSeparator());
			
			test++;
			n = Integer.parseInt(br.readLine());
		}
		
		System.out.print(sb.toString());
	}

}
