package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5525 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String s = br.readLine();
		char[] sArr = s.toCharArray();
		int size = m - (2*n + 1);
		int answer = 0;
		
		for (int i = 0; i <= size; i++) {
			if (sArr[i] == 'I') {
				int count = 0;
				while (sArr[i+1] == 'O' && sArr[i+2] == 'I') {
					count++;
					i += 2;
					if (i > m - 2) {
						break;
					}
				}
				
				if (count >= n) {
					answer += count - n + 1;
				}
			}
		}
		
		System.out.println(answer);
	}

}
