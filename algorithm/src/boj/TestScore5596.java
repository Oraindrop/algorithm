package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestScore5596 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");
		
		long answer1 = 0;
		long answer2 = 0;
		
		for (int i = 0; i < 4; i++) {
			answer1 += Integer.parseInt(arr1[i]);
			answer2 += Integer.parseInt(arr2[i]);
		}
		
		long answer = Math.max(answer1, answer2);
		
		System.out.println(answer);
	}

}
