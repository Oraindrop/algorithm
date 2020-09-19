package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1057 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int kim = Integer.parseInt(st.nextToken());
		int lim = Integer.parseInt(st.nextToken());
		
		System.out.println(go(n, kim, lim));
	}
	
	static int go(int n, int kim, int lim) {
		for (int i = 1; i <= (n+1) / 2; i++) {
			kim = (kim + 1) / 2;
			lim = (lim + 1) / 2;
			if (kim == lim) {
				return i;
			}
		}
		return -1;
	}

}
