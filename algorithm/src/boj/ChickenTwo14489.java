package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChickenTwo14489 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long chicken = Long.parseLong(br.readLine());

		if (a + b >= chicken + chicken) {
			System.out.println(a + b - chicken - chicken);
		} else {
			System.out.println(a + b);
		}
	}
}
