package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2930 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		String base = br.readLine();
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		int sum = 0;
		int max = 0;
		for (int i = 0; i < r; i++) {
			String baseElement = base.substring(i, i+1); 

			int rSum = 0;
			int sSum = 0;
			int pSum = 0;
			
			for (int j = 0; j < n; j++) {
				String target = arr[j].substring(i, i+1);
				sum += judge(baseElement, target);
				rSum += judge("R", target);
				sSum += judge("S", target);
				pSum += judge("P", target);
			}
			
			max += Math.max(Math.max(rSum, sSum), pSum);
		}
		
		System.out.println(sum);
		System.out.println(max);
	}
	
	private static int judge(String base, String target) {
		if (base.equals(target)) 
			return 1;
		
		if (base.equals("R")) {
			if (target.equals("S")) {
				return 2;
			} else {
				return 0;
			}
		}
		
		if (base.equals("S")) {
			if (target.equals("P")) {
				return 2;
			} else {
				return 0;
			}
		}
		
		if (base.equals("P")) {
			if (target.equals("R")) {
				return 2;
			} else {
				return 0;
			}
		}
		
		throw new IllegalArgumentException();
	}

}
