package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj13410 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= k; i++) {
			list.add(reverse(n * i));
		}
		
		Collections.sort(list);
		System.out.println(list.get(k-1));
	}
	
	static int reverse(int number) {
		int answer = 0;
		while (number > 0) {
			answer *= 10;
			answer += number % 10;
			number /= 10;
		}
		return answer;
	}

}
