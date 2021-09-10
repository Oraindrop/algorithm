package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14264 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double l = Double.parseDouble(br.readLine());
		
		System.out.println(Math.sqrt(3) * l * l / 4.0);
	}

}
