package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FactorSum9506 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		List<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		while (!s.equals("-1")) {
			int n = Integer.parseInt(s);
			list.clear();
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					list.add(i);
				}
			}
			
			if (n == sumList(list)) {
				printList(sb, n, list);
			} else {
				sb.append(n).append(" is NOT perfect.").append(System.lineSeparator());
			}
			
			s = br.readLine();
		}
		
		System.out.println(sb.toString());
	}

	static int sumList(List<Integer> list) {
		int answer = 0;
		for (int i : list) {
			answer += i;
		}
		return answer;
	}
	
	static void printList(StringBuilder sb, int n, List<Integer> list) {
		sb.append(n).append(" = ");
		for (int i : list) {
			sb.append(i).append(" + ");
		}
		sb.delete(sb.length() - 3, sb.length());
		sb.append(System.lineSeparator());
	}
}
