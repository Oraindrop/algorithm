package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HundredVsTen14490 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(":");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int mod = euclidean(a, b);
		System.out.println(a/mod + ":" + b/mod);
	}
	
    static int euclidean(int n, int m) {
    	// m > n
    	if(n == 0) {
    		return m;
    	}
    	return euclidean(m%n, n);
    	
    }

}
