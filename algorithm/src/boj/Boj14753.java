package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj14753 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		List<Integer> answers = new ArrayList<>();
		answers.add(list.get(0) * list.get(1));
		answers.add(answers.get(0) * list.get(2));
		answers.add(list.get(n-1) * list.get(n-2));
		answers.add(answers.get(2) * list.get(n-3));
		answers.add(answers.get(0) * list.get(n-1));

		Collections.sort(answers);

		System.out.println(answers.get(4));
	}

}
