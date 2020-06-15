package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj1672 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("AA" ,"A");
		map.put("AG" ,"C");
		map.put("AC" ,"A");
		map.put("AT" ,"G");
		map.put("GA" ,"C");
		map.put("GG" ,"G");
		map.put("GC" ,"T");
		map.put("GT" ,"A");
		map.put("CA" ,"A");
		map.put("CG" ,"T");
		map.put("CC" ,"C");
		map.put("CT" ,"G");
		map.put("TA" ,"G");
		map.put("TG" ,"A");
		map.put("TC" ,"G");
		map.put("TT" ,"T");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		String[] arr = input.split("");
		
		while(n > 2) {
			arr[n-2] = map.get(arr[n-2] + arr[n-1]);
			n--;
		}
		
		if (n == 1) {
			System.out.println(arr[0]);
		} else {
			System.out.println(map.get(arr[0] + arr[1]));
		}
	}

}
