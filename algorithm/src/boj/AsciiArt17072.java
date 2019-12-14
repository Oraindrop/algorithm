package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AsciiArt17072 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int r = Integer.parseInt(st.nextToken());
				int g = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				sb.append(convert(go(r, g, b)));
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

	static int go (int r, int g, int b) {
		return (r * 2126) + (g * 7152) + (b * 722);
	}
	
	static String convert(int value) {
		if (value >= 0 && value < 510000) {
			return "#";
		} else if (value < 1020000) {
			return "o";
		} else if (value < 1530000) {
			return "+";
		} else if (value < 2040000) {
			return "-";
		} else {
			return ".";
		}
	}
}
