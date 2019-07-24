package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CalculateGrade2755 {

	static Map<String, Double> map = new HashMap<>();
	
	static {
		map.put("A+", 4.3);
		map.put("A0", 4.0);
		map.put("A-", 3.7);
		map.put("B+", 3.3);
		map.put("B0", 3.0);
		map.put("B-", 2.7);
		map.put("C+", 2.3);
		map.put("C0", 2.0);
		map.put("C-", 1.7);
		map.put("D+", 1.3);
		map.put("D0", 1.0);
		map.put("D-", 0.7);
		map.put("F", 0.0);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int totalGrade = 0;
		double totalScore = 0.0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			int grade = Integer.parseInt(st.nextToken());
			totalGrade += grade;
			double score = map.get(st.nextToken());
			totalScore += score * grade;
		}
		System.out.println(String.format("%.02f", totalScore/totalGrade));
	}

}
