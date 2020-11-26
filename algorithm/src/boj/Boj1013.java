package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1013 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	    String pattern = "(100+1+|01)+";
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < t; i++) {
	    	sb.append(br.readLine().matches(pattern) ? "YES" : "NO").append(System.lineSeparator());
	    }
	    
	    System.out.print(sb.toString());
	}

}
