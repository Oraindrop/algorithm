package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2502 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] aArr = new int[31];
		int[] bArr = new int[31];
		
		aArr[3] = 1;
		bArr[3] = 1;
		aArr[4] = 1;
		bArr[4] = 2;
		
		for (int i = 5; i < 31; i++) {
			aArr[i] = aArr[i-1] + aArr[i-2];
			bArr[i] = bArr[i-1] + bArr[i-2];
		}
		
		for (int i = 1; i < k; i++) {
			int maybeB = k - (aArr[d] * i);
			if (maybeB % bArr[d] == 0) {
				System.out.println(i);
				System.out.println(maybeB / bArr[d]);
				break;
			}
		}
		
	}

}
