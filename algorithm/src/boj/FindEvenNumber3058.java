package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FindEvenNumber3058 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			list.clear();
			for (int j = 0; j < 7; j++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			sb.append(goEvenSum(list)).append(" ").append(goEvenMin(list)).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}
	
	static int goEvenSum(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	static int goEvenMin(List<Integer> list) {
		int min = 101;
		for (int i : list) {
			if (i % 2 == 0 && i < min) {
				min = i;
			}
		}
		return min;
	}

}
