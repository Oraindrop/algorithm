package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWordTwo17413 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char[] cArr = s.toCharArray();
		int size = s.length();
		int index = 0;
		StringBuilder sb = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		while (index < size) {
			char c = cArr[index];
			if (c == '<') {
				sb.append(c);
				while (c != '>') {
					index++;
					c = cArr[index];
					sb.append(c);
				}
				index++;
			} else {
				temp.setLength(0);
				while (c != '<' && c != ' ' && index < size - 1) {
					temp.insert(0, c);
					index++;
					c = cArr[index];
				}
				if (c == ' ') {
					temp.append(c);
					index++;
				} else if (index == size - 1) {
					temp.insert(0, c);
					index++;
				}
				sb.append(temp.toString());
			}
		}
		
		System.out.println(sb.toString());
	}

}
