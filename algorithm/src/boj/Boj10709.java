package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10709 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		String[][] arr = new String[h][w];
		for (int i = 0; i < h; i++) {
			String s = br.readLine();
			for (int j = 0; j < w; j++) {
				arr[i][j] = s.substring(j, j+1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (arr[i][j].equals("c")) {
					sb.append(0).append(" ");
				} else {
					int answer = -1;
					for (int k = j-1; k >= 0; k--) {
						if (arr[i][k].equals("c")) {
							answer = j - k;
							break;
						}
					}
					sb.append(answer).append(" ");
				}
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
