package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Deposit4998 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			try {
				StringTokenizer st = new StringTokenizer(br.readLine());
				double n = Double.parseDouble(st.nextToken());
				double b = Double.parseDouble(st.nextToken());
				double m = Double.parseDouble(st.nextToken());
				go(n, b, m);	
			} catch (Exception e) {
				break;
			}
		}
	}
	
	static void go(double n, double b, double m) {
		double mult = (b + 100.0) / 100.0;
		
		double save = n;
		int count = 0;
		while (save < m) {
			save *= mult;
			count++;
		}
		
		System.out.println(count);
	}

}
