package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2875 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		for (int i = 0; i < 51; i++) {
			int tempN = n - (i*2);
			int tempM = m - i;
			
			if (tempN < 0 || tempM < 0) {
				break;
			}
			
			int tempK = tempN + tempM;
			
			if (tempK < k) {
				break;
			}
			
			answer = i;
		}
		
		System.out.println(answer);
	}

}
