package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlphabetDistance5218 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			
			String answer = "Distances: ";
			for (int j = 0; j < s1.length(); j++) {
				int diff = s2.charAt(j) >= s1.charAt(j) ? s2.charAt(j) - s1.charAt(j) : s2.charAt(j) + 26 - s1.charAt(j);
				
				answer += diff;
				answer += " ";
			}
			
			System.out.println(answer);
		}
	}

}
