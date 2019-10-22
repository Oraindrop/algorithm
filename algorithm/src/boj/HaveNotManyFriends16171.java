package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HaveNotManyFriends16171 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String key = br.readLine();
		String book = "";
		for (char c : s.toCharArray()) {
			if (c >= 48 && c <= 57) {
				// skip
			} else {
				book += c;
			}
		}

		System.out.println(book.contains(key) ? 1 : 0);
	}

}
