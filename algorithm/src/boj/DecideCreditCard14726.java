package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DecideCreditCard14726 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] arr;
		List<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			arr = br.readLine().split("");
			list = Arrays.stream(arr).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
			for (int j = 0; j < list.size(); j++) {
				int value = list.get(j);
				int temp = 0;
				if (j%2 == 0) {
					value *= 2;
					temp = value >= 10 ? value / 10 + value % 10 : value; 
					list.remove(j);
					list.add(j, temp);
				}
			}
			sb.append(go(list)).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

	static String go(List<Integer> list) {
		int answer = 0;
		for (int i : list) {
			answer += i;
		}
		return answer % 10 == 0 ? "T" : "F";
	}
}
