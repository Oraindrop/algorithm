package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String1120 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		int diff = b.length() - a.length();
		
		int min = 51;
		for (int i = 0; i <= diff; i++) {
			String c = b.substring(i, i + a.length());
			int d = go(a, c);
			min = d < min ? d : min;
		}
		System.out.println(min);
	}
	
	static int go(String a, String b) {
		char[] aa = a.toCharArray();
		char[] bb = b.toCharArray();
		int answer = 0;
		for (int i = 0; i < a.length(); i++) {
			if (aa[i] != bb[i]) answer++;
		}
		return answer;
	}

}
