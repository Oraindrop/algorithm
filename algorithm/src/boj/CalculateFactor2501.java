package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculateFactor2501 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int count = 0;
		String answer = "";
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) count++;
			if (count == k) {
				answer += i;
				break;
			}
		}
		
		if (answer.isEmpty()) answer = "0";
		System.out.println(answer);
	}

}
