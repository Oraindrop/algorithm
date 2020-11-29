package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2863 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double[] arr = new double[4];
		double[] maxArr = new double[4];
		arr[0] = Double.parseDouble(st.nextToken());
		arr[1] = Double.parseDouble(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr[2] = Double.parseDouble(st.nextToken());
		arr[3] = Double.parseDouble(st.nextToken());
		
		maxArr[0] = arr[0]/arr[2] + arr[1]/arr[3];
		maxArr[1] = arr[2]/arr[3] + arr[0]/arr[1];
		maxArr[2] = arr[3]/arr[1] + arr[2]/arr[0];
		maxArr[3] = arr[1]/arr[0] + arr[3]/arr[2];
		
		double max = 0.0;
		int index = 0;
		for (int i = 0; i < 4; i++) {
			if (maxArr[i] > max) {
				max = maxArr[i];
				index = i;
			}
		}
		
		System.out.println(index);
	}

}
