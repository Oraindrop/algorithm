package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Tawla11800 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Map<Integer, String> singleMap = new HashMap<>();
		singleMap.put(1, "Yakk");
		singleMap.put(2, "Doh");
		singleMap.put(3, "Seh");
		singleMap.put(4, "Ghar");
		singleMap.put(5, "Bang");
		singleMap.put(6, "Sheesh");
		
		Map<Integer, String> doubleMap = new HashMap<>();
		doubleMap.put(1, "Habb Yakk");
		doubleMap.put(2, "Dobara");
		doubleMap.put(3, "Dousa");
		doubleMap.put(4, "Dorgy");
		doubleMap.put(5, "Dabash");
		doubleMap.put(6, "Dosh");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append("Case ").append(i).append(": ");
			if (a == b) {
				sb.append(doubleMap.get(a));
			} else if ((a == 5 && b == 6) || (a == 6 && b == 5)) {
				sb.append("Sheesh Beesh");
			} else {
				String value = a > b ? singleMap.get(a) + " " + singleMap.get(b) : singleMap.get(b) + " " + singleMap.get(a);
				sb.append(value);
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
