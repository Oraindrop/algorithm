package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNumber3460 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int dec = Integer.parseInt(br.readLine());
			String bin = Integer.toBinaryString(dec);
			int size = bin.length() - 1;
			for (int j = 0; j < bin.length(); j++) {
				if (bin.charAt(size - j) == '1') System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
