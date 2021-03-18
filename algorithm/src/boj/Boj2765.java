package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2765 {
	
	private static final double PI = 3.1415927;
	private static final int MILE_TO_INCH = 63360;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String[] input = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		int index = 1;
		while(!input[1].equals("0")) {
			double diameter = Double.parseDouble(input[0]);
			int cycle = Integer.parseInt(input[1]);
			double seconds = Double.parseDouble(input[2]);
			
			double distance = diameter * PI * cycle / MILE_TO_INCH;
			double mph = distance / seconds * 3600;
			
			sb.append(String.format("Trip #%d: %.02f %.02f", index, distance, mph)).append(System.lineSeparator());
			input = br.readLine().split(" ");
			index++;
		}
		System.out.print(sb.toString());
	}

}
