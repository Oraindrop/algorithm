package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StrongBattle17251 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		int max = Collections.max(list);
		List<Integer> maxIndexs = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (list.get(i) == max) maxIndexs.add(i);
		}
		
		int b = Collections.min(maxIndexs) - 0;
		int r = n - Collections.max(maxIndexs) - 1;
				
		if (r > b) System.out.println("R");
		else if (b > r) System.out.println("B");
		else System.out.println("X");
	}

}
