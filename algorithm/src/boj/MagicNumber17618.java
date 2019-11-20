package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicNumber17618 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0;
		
		for (int i = 1; i < t+1; i++) {
			int mod = magicSum(i);
			if (i % mod == 0) answer++;
		}
		
		System.out.println(answer);
		
	}
	
	static int magicSum(int i) {
		int answer = 0;
		while (i > 0) {
			answer += i % 10;
			i /= 10;
		}
		return answer;
	}

}
