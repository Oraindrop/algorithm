package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj6778 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
    
        if (a >= 3 && b <= 4) {
          sb.append("TroyMartian").append(System.lineSeparator());
        }
        
        if (a <= 6 && b >= 2) {
          sb.append("VladSaturnian").append(System.lineSeparator());
        }
        
        if (a <= 2 && b <= 3) {
          sb.append("GraemeMercurian").append(System.lineSeparator());
        }
    
        System.out.println(sb.toString());
	}
}
