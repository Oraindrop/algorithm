package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Boj20044 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		Collections.sort(list);
		int length = list.size();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < length; i++) {
			int value = list.get(i) + list.get(length-1-i);
			min = Math.min(min, value);
		}
		
		System.out.println(min);
	}

}
