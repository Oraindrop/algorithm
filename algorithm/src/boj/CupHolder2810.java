package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CupHolder2810 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		String reS = s.replaceAll("LL", "S");
		
		int seat = reS.length() + 1;
		
		System.out.println(n < seat ? n : seat);
		
	}

}
