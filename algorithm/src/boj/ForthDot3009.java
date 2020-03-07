package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ForthDot3009 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] xArr = new int[3];
		int[] yArr = new int[3];
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			xArr[i] = Integer.parseInt(st.nextToken());
			yArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int x = xArr[0] - xArr[1] == 0 ? xArr[2] : xArr[1] - xArr[2] == 0 ? xArr[0] : xArr[1];
		int y = yArr[0] - yArr[1] == 0 ? yArr[2] : yArr[1] - yArr[2] == 0 ? yArr[0] : yArr[1];
		
		System.out.println(String.format("%s %s", x, y));
	}

}
