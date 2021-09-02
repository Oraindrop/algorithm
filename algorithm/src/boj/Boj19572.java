package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj19572 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int d1 = Integer.parseInt(st.nextToken());
		int d2 = Integer.parseInt(st.nextToken());
		int d3 = Integer.parseInt(st.nextToken());
		
		int aa = d1 + d2 - d3;
		int bb = d1 + d3 - d2;
		int cc = d2 + d3 - d1;
		
		if (aa <= 0 || bb <= 0 || cc <= 0) {
			System.out.println(-1);
		} else {
			System.out.println(1);
			System.out.println(String.format("%.1f", aa/2.0) + " " + String.format("%.1f", bb/2.0) + " " + String.format("%.1f", cc/2.0));
		}
	}

}
