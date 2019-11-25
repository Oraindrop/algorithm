package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaseConvert2745 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		int size = s.length();
		int base = Integer.parseInt(st.nextToken());
		int answer = 0;
		char[] cArr = s.toCharArray();
		for (int i = size-1; i >= 0; i--) {
			char c = cArr[i];
			int mult = 0;
			if (c >= 'A' && c <= 'Z') {
				mult = c - 'A' + 10;
			} else {
				mult = c - '0';
			}
			for (int j = 0; j < size - 1 - i; j++) {
				mult *= base;
			}
			answer += mult;
		}
		System.out.println(answer);
	}

}
