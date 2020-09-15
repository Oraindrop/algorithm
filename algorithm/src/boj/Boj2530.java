package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2530 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(br.readLine());
		
		int time = (a*3600) + (b*60) + c + d;
		int s = time % 60;
		int m = (time / 60) % 60;
		int h = (time / 3600) % 24;
		
		System.out.println(h + " " + m + " " + s);
	}

}
