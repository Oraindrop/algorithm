package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1188 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int gcd = n < m ? euclidean(n, m) : euclidean(m, n);
		
		System.out.println(m - gcd);
	}
	
    public static int euclidean(int n, int m) {
    	// m > n
    	if(n == 0) {
    		return m;
    	}
    	return euclidean(m%n, n);
    	
    }

}
