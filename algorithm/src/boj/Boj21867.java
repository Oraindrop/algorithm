package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj21867 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String input = br.readLine();
		String answer = input.replaceAll("[JAV]", "");
		System.out.println(answer.length() == 0 ? "nojava" : answer);
	}

}
