package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ManyWord1371 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String str;
        while ((str = br.readLine()) != null) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    arr[str.charAt(i) - 'a']++;
                }
            }
        }
		
		int max = Collections.max(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		String answer = "";

		for (int i = 0; i < 26; i++) {
			if (arr[i] == max) {
				answer += (char)(i + 97);
			}
		}
		
		System.out.println(answer);
	}

}
