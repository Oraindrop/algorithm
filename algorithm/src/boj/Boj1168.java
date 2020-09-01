package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj1168 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken()) - 1;
		
		List<Integer> list = new ArrayList<>();
		List<Integer> answers = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		int key = k;
		while (answers.size() != n) {
			int size = list.size();
			if (key >= size) {
				key %= size;
			}
			answers.add(list.remove(key));
			key += k;
		}
		
		String answer = "<" + answers.toString().substring(1);
		answer = answer.substring(0, answer.length() - 1) + ">";
		System.out.println(answer);
	}

}
