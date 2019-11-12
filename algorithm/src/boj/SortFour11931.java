package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortFour11931 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		List<Integer> answers = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		StringBuilder sb = new StringBuilder();
		for (int i : answers) {
			sb.append(i).append(System.lineSeparator());
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
