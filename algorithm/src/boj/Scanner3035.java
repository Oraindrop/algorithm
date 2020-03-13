package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Scanner3035 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		st.nextToken();
		int zr = Integer.parseInt(st.nextToken());
		int zc = Integer.parseInt(st.nextToken());
		
		StringBuilder totalStringBuilder = new StringBuilder();
		StringBuilder lineStringBuilder = new StringBuilder();
		
		for (int i = 0; i < r; i++) {
			String input = br.readLine();
			lineStringBuilder.setLength(0);
			
			for (char ch : input.toCharArray()) {
				for (int j = 0; j < zc; j++) {
					lineStringBuilder.append(ch);
				}
			}
			
			for (int j = 0; j < zr; j++) {
				totalStringBuilder.append(lineStringBuilder.toString()).append(System.lineSeparator());
			}
		}
		
		System.out.print(totalStringBuilder.toString());
	}

}
