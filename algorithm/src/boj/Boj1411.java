package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj1411 {
	static Map<Integer, Integer> map1 = new HashMap<>();
	static Map<Integer, Integer> map2 = new HashMap<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] inputs = new String[n];
		for (int i = 0; i < n; i++) {
			inputs[i] = br.readLine();
		}
		
		int count = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (compare(inputs[i], inputs[j])) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	static boolean compare(String a, String b) {
		map1.clear();
		map2.clear();
		
		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();
		for (int i = 0; i < aArr.length; i++) {
			int num1 = aArr[i] - 'a';
			int num2 = bArr[i] - 'a';
			
			if (map1.containsKey(num1)) {
				if (map1.get(num1) != num2) {
					return false;
				}
			} else if (map2.containsKey(num2)) {
				if (map2.get(num2) != num1) {
					return false;
				}
			} else {
				map1.put(num1, num2);
				map2.put(num2, num1);
			}
		}
		return true;
	}

}
