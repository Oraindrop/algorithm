package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj16727 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] pArr = new int[2];
		int[] sArr = new int[2];
		
		pArr[0] = Integer.parseInt(st.nextToken());
		sArr[0] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		sArr[1] = Integer.parseInt(st.nextToken());
		pArr[1] = Integer.parseInt(st.nextToken());
		
		int pSum = pArr[0] + pArr[1];
		int sSum = sArr[0] + sArr[1];
		
		if (pSum > sSum) {
			System.out.println("Persepolis");
		} else if (sSum > pSum) {
			System.out.println("Esteghlal");
		} else {
			if (pArr[1] > sArr[0]) {
				System.out.println("Persepolis");	
			} else if (sArr[0] > pArr[1]) {
				System.out.println("Esteghlal");	
			} else {
				System.out.println("Penalty");
			}
		}
	}

}
