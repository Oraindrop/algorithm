package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Boj14582 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list1 = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		boolean result = go(list1, list2);
		System.out.println(result ? "Yes" : "No");
	}
	
	static boolean go(List<Integer> list1, List<Integer> list2) {
		if (list1.get(0) > 0) {
			return true;
		}
		
		int[] arr1 = new int[9];
		int[] arr2 = new int[9];
		
		arr1[0] = list1.get(0);
		arr2[0] = list2.get(0);
		
		for (int i = 1; i < 9; i++) {
			 arr1[i] = arr1[i-1] + list1.get(i);
			 if (arr1[i] > arr2[i-1]) {
				 return true;
			 } else {
				 arr2[i] = arr2[i-1] + list2.get(i);
			 }
		}
		
		return false;
	}

}
