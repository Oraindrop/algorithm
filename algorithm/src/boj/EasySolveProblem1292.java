package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class EasySolveProblem1292 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		int index = 1;
		while (list.size() < 1000) {
			for (int i = 0; i < index; i++) {
				list.add(index);
			}
			index++;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		long sum = 0;
		for (int i = a-1; i < b; i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
	}

}
