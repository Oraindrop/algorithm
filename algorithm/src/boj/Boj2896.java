package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2896 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		for (int i = 0; i < 3; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		double[] max = new double[3];
		double min = 1000;
		for (int i = 0; i < 3; i++) {
			max[i] = (double)arr1[i] / (double)arr2[i];
			if (min > max[i]) {
				min = max[i];
			}
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr1[i] - arr2[i] * min);
		}
	}

}
