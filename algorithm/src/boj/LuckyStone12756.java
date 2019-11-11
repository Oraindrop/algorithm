package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LuckyStone12756 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int aA = Integer.parseInt(st.nextToken());
		int aH = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int bA = Integer.parseInt(st.nextToken());
		int bH = Integer.parseInt(st.nextToken());
		
		int a = bH / aA;
		a = bH % aA == 0 ? a : a + 1;
		
		int b = aH / bA;
		b = aH % bA == 0 ? b : b + 1;
		
		if (a < b) {
			System.out.println("PLAYER A");
		} else if (a == b) {
			System.out.println("DRAW");
		} else {
			System.out.println("PLAYER B");
		}
	}

}
