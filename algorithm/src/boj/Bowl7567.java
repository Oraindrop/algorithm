package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bowl7567 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		int answer = 10;
		char pre = arr[0];
		for (int i = 1; i < arr.length; i++) {
			char cur = arr[i];
			answer += pre == cur ? 5 : 10;
			pre = cur;
		}
		
		System.out.println(answer);
	}

}
