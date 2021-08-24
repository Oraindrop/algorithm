package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj11921 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		br.readLine();
		
		long sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		
		bw.write("100\n");
		bw.write(String.valueOf(sum));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}

}
