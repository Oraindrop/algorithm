package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AddAppleGame2828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int m = Integer.parseInt(st.nextToken());
		
		int j = Integer.parseInt(br.readLine());
		
		int min = 1;
		int max = m;
		int answer = 0;
		
		for (int i = 0; i < j; i++) {
			int apple = Integer.parseInt(br.readLine());
			int value = go(min, max, apple);
			answer += value > 0 ? value : -1 * value;
			min += value;
			max += value;
		}
		
		System.out.println(answer);
	}

	private static int go(int min, int max, int apple) {
		if (apple >= min && apple <= max) {
			return 0;
		}
		
		return apple < min ? apple - min : apple - max;
	}

}
