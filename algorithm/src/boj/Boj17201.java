package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Boj17201 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<String>();
		
		String a = "";
		String b = "";
		for (int i = 0; i < n; i++) {
			a += "12";
			b += "21";
		}
		
		set.add(a);
		set.add(b);
		
		String input = br.readLine();
		
		System.out.println(set.contains(input) ? "Yes" : "No");
	}

}
