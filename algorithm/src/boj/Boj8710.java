package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj8710 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cur = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		int size = Integer.parseInt(st.nextToken());
		int diff = target - cur;
		int answer = 0;
		if (diff % size == 0) {
			answer = diff / size;
		} else {
			answer = (diff / size) + 1;
		}
		
		System.out.println(answer);
	}

}
