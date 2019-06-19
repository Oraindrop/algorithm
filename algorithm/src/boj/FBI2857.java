package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FBI2857 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";
		for (int i = 1; i <= 5; i++) {
			String s = br.readLine();
			if(s.contains("FBI")) answer += i + " ";
		}
		if (answer.isEmpty()) {
			System.out.println("HE GOT AWAY!");
		} else {
			System.out.println(answer);	
		}
	}

}
