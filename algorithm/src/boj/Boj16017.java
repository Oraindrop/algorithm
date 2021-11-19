package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Boj16017 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[4];
		
		for (int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(8);
		set.add(9);
		
		if (set.contains(arr[0]) && set.contains(arr[3]) && arr[1] == arr[2]) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}
	}

}
