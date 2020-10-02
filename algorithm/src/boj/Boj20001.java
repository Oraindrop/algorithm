package boj;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class Boj20001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int count = 0;
		String input = br.readLine();
		
		while (!input.equals("고무오리 디버깅 끝")) {
			if (input.equals("문제")) {
				count++;
			} else if (input.equals("고무오리")) {
				if (count == 0) {
					count += 2;
				} else {
					count--;
				}
			}
			input = br.readLine();
		}
		
		System.out.println(count == 0 ? "고무오리야 사랑해" : "힝구");
		
	}

}
