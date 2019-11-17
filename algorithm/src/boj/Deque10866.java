package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Deque10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			String op = st.nextToken();
			if (op.equals("push_front")) {
				list.add(0, Integer.parseInt(st.nextToken()));
			} else if (op.equals("push_back")) {
				list.add(Integer.parseInt(st.nextToken()));
			} else if (op.equals("pop_front")) {
				sb.append(list.isEmpty() ? "-1" : list.remove(0)).append(System.lineSeparator());
			} else if (op.equals("pop_back")) {
				sb.append(list.isEmpty() ? "-1" : list.remove(list.size()-1)).append(System.lineSeparator());
			} else if (op.equals("size")) {
				sb.append(list.size()).append(System.lineSeparator());
			} else if (op.equals("empty")) {
				sb.append(list.isEmpty() ? "1" : "0").append(System.lineSeparator());
			} else if (op.equals("front")) {
				sb.append(list.isEmpty() ? "-1" : list.get(0)).append(System.lineSeparator());
			} else if (op.equals("back")) {
				sb.append(list.isEmpty() ? "-1" : list.get(list.size()-1)).append(System.lineSeparator());
			}
		}
		System.out.print(sb.toString());
	}

}
