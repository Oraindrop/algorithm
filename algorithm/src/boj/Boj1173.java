package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1173 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int targetMinutes = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		int plus = Integer.parseInt(st.nextToken());
		int minus = Integer.parseInt(st.nextToken());
		
		int value = min;
		int answer = 0;
		
		while (targetMinutes > 0) {

			
			if (value + plus <= max) {
				value += plus;
				answer++;
				targetMinutes--;
			} else {
				value -= minus;
				if (value < min) {
					value = min;
				}
				answer++;
			}
			
			if (value <= min && value + plus > max) {
				answer = -1;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
