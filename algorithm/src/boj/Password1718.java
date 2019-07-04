package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password1718 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();
		String key = br.readLine();
		int keySize = key.length();
		int index = 0;
		StringBuilder sb = new StringBuilder();
		for (char c : target.toCharArray()) {
			if (c == 32) {
				sb.append(c);
				index++;
			} else {
				int curIndex = index % keySize;
				index++;
				char keyChar = key.charAt(curIndex);
				int diff = (int)c - (int) ((int)keyChar - 96);
				
				c = diff < 97 ? (char)(26 + diff) : (char)diff;
				sb.append(c);
			}
		}
		
		System.out.println(sb.toString());
	}

}
