package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(n/25).append(" ");
            n %= 25;
            sb.append(n/10).append(" ");
            n %= 10;
            sb.append(n/5).append(" ");
            n %= 5;
            sb.append(n).append(System.lineSeparator());
        }

		System.out.println(sb.toString());
	}

}
