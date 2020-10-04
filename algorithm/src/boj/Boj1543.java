package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1543 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();
		String key = br.readLine();
		int count = 0;
		int index = target.indexOf(key);
		
		while (index > -1) {
			count++;
			target = target.substring(index + key.length());
			index = target.indexOf(key);
		}
		
		System.out.println(count);
	}

}
