package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15820 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s1 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());
		
		boolean a1 = true;
		boolean a2 = true;
		
		for (int i = 0; i < s1; i++) {
			st = new StringTokenizer(br.readLine());
			if (Integer.parseInt(st.nextToken()) != Integer.parseInt(st.nextToken())) {
				a1 = false;
			}
		}
		
		for (int i = 0; i < s2; i++) {
			st = new StringTokenizer(br.readLine());
			if (Integer.parseInt(st.nextToken()) != Integer.parseInt(st.nextToken())) {
				a2 = false;
			}
		}
		
		if (a1 && a2) {
			System.out.println("Accepted");
		} else if (!a1) {
			System.out.println("Wrong Answer");
		} else if (a1 && !a2) {
			System.out.println("Why Wrong!!!");
		}
	}

}
