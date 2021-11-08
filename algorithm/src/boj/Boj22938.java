package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj22938 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");
		
		long diffx = Long.parseLong(arr1[0]) - Long.parseLong(arr2[0]);
		long diffy = Long.parseLong(arr1[1]) - Long.parseLong(arr2[1]);
		long r1 = Long.parseLong(arr1[2]);
		long r2 = Long.parseLong(arr2[2]);
		
		if ( (diffx*diffx + diffy*diffy) < (r1*r1 + r2*r2 + 2*r1*r2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
