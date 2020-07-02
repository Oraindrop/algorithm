package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Boj2959 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		Collections.sort(list);
		System.out.println(list.get(0) * list.get(2));
	}

}
