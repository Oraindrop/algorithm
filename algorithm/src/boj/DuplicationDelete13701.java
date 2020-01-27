package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DuplicationDelete13701 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[33554432];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			int value = Integer.parseInt(st.nextToken());
			if (!arr[value]) {
				arr[value] = true;
				bw.write(value + " ");
			}
		}
		
		bw.flush();
		bw.close();
	}

}
