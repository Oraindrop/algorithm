package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj12755 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		int sum = 0;
		int[] arr = new int[9];
		for (int i = 0; i < 8; i++) {
			sum += 9 * (int) Math.pow(10, i) * (i+1);
			arr[i+1] = sum;
		}
		
		for (int i = 1; i <= 8; i++) {
			if (index <= arr[i]) {
				int temp = index - arr[i-1] - 1;
				int mod = temp % i;
				int div = temp / i;
				int value = (int)Math.pow(10, i-1) + div;
				String s = String.valueOf(value);
				System.out.println(s.charAt(mod));
				break;
			}
		}
	}

}
