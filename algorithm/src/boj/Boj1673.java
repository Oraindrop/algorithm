package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1673 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 3; i++) {
			String input = br.readLine();
			String pre = "0";
			int count = 1;
			int max = 1;
			for (int j = 0; j < 8; j++) {
				String cur = input.substring(j, j+1);
				if (pre.equals(cur)) {
					count++;
				} else {
					pre = cur;
					if (count > max) {
						max = count;
					}
					count = 1;
				}
			}
			if (count > max) {
				max = count;
			}
			System.out.println(max);
		}
	}

}
