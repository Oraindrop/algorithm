package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangYungDiary2954 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		s = s.replaceAll("apa", "a").replaceAll("epe", "e").replaceAll("ipi", "i").replaceAll("opo", "o").replaceAll("upu", "u");
		
		System.out.println(s);
	}

}
