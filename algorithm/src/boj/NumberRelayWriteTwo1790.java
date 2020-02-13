package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberRelayWriteTwo1790 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		long[] arr = new long[9];
		arr[0] = 1;
		long oneLocation = 1;
		for (long i = 1; i <= 8; i++) {
			oneLocation += i * (long)(9 * Math.pow(10, i-1));
			arr[(int)i-1] = oneLocation;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String input = st.nextToken();
		
		long n = Long.parseLong(input);
		long k = Long.parseLong(st.nextToken());
		
		System.out.println(go(arr, k, n));
	}

	private static int go(long[] arr, long k, long n) {
		for (int i = 1; i < 9; i++) {
			if (k < arr[i]) {
				// i+1 자리수
				long temp = k - arr[i-1];
				long value = (temp / (i+1)) + (long)Math.pow(10, i) ;
				if (value > n) {
					return -1;
				} else {
					String s = String.valueOf(value);
					long mod = temp % (i+1);
					return Integer.parseInt(s.substring((int)mod, (int)(mod+1)));
				}
			} else if (k == arr[i]) {
				return 1;
			}
		}
		
		if (k > arr[8] + 9) {
			return -1;
		} else {
			return k % arr[8] == 1 ? 1 : 0;	
		}
	}

}
