package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CaesarCipher15874 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int leng = Integer.parseInt(st.nextToken());
		int mod = k % 26;
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
	
		for (int i = 0; i < leng; i++) {
			int c = (int)s.charAt(i);
			if (c >= 65 && c <= 90) {
				c += mod;
				c = c > 90 ? c - 26 : c;
				sb.append((char)c);
			} else if (c >= 97 && c <= 122) {
				c += mod;
				c = c > 122 ? c - 26 : c;
				sb.append((char)c);
			} else {
				sb.append((char)c);
			}
		}
		
		System.out.println(sb.toString());
	}

}
