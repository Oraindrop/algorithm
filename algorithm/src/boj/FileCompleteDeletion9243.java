package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileCompleteDeletion9243 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String s1 = br.readLine();
		String s2 = br.readLine();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		boolean answer = go(c1, c2, n);
		
		System.out.println(answer ? "Deletion succeeded" : "Deletion failed");
	}
	
	static boolean go(char[] c1, char[] c2, int n) {
		
		if (n % 2 == 0) {
			for (int i = 0; i < c1.length; i++) {
				if (c1[i] != c2[i])
					return false;
			}
		} else {
			for (int i = 0; i < c1.length; i++) {
				if (c1[i] == c2[i]) 
					return false;
			}
		}
		
		return true;
	}

}
