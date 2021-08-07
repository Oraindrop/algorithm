package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj1350 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		long answer = 0;
		long[] arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long size = Long.parseLong(br.readLine());
		
		for (long num : arr) {
			if (num > 0) {
				long div = num / size;
				if (num % size != 0) div++;
				answer += div;
			}
		}
		
		System.out.println(answer * size);
	}

}
