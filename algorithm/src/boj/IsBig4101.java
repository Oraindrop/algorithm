package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class IsBig4101 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		BigInteger a;
		BigInteger b;
		while (!s.equals("0 0")) {
			st = new StringTokenizer(s);
			a = new BigInteger(st.nextToken());
			b = new BigInteger(st.nextToken());
			sb.append(a.compareTo(b) == 1 ? "Yes" : "No").append(System.lineSeparator());
			s = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
