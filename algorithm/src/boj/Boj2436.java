package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2436 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long gcd = Long.parseLong(st.nextToken());
		long lcm = Long.parseLong(st.nextToken());
		long mul = gcd * lcm;
		long answerA = 100000000;
		long answerB = 100000000;
		for (long i = gcd; i*i <= mul; i += gcd) {
			long a = i;
			long b = mul / i;
			if (euclidean(a, b) == gcd && (a*b) / gcd == lcm) {
				if ( (a + b) < (answerA + answerB) ) {
					answerA = a;
					answerB = b;
				}
			}
		}
		System.out.println(answerA + " " + answerB);
	}
	
    public static long euclidean(long n, long m) {
    	// m > n
    	if(n == 0) {
    		return m;
    	}
    	return euclidean(m%n, n);
    	
    }

}
