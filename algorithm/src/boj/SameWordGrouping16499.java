package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SameWordGrouping16499 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		for (int i = 0; i < t; i++) {
			String[] sArr = br.readLine().split("");
			Arrays.sort(sArr);
			set.add(String.join("", sArr));
		}
		System.out.println(set.size());
	}

}
