package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj3076 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		String xBlock = getOneBlock("X", b);
		String dotBlock = getOneBlock(".", b);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < r; i++) {
			boolean firstX = i % 2 == 0;
			String line = "";
			for (int j = 0; j < c; j++) {
				if (firstX) {
					if (j % 2 == 0) {
						line += xBlock;
					} else {
						line += dotBlock;
					}
				} else {
					if (j % 2 == 0) {
						line += dotBlock;
					} else {
						line += xBlock;
					}
				}
			}
			for (int j = 0; j < a; j++) {
				sb.append(line).append(System.lineSeparator());
			}
		}
		
		System.out.print(sb.toString());
	}

	static String getOneBlock(String s, int b) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < b; i++) {
			sb.append(s);
		}
		return sb.toString();
	}
}
