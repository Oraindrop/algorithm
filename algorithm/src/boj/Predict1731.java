package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Predict1731 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<Long> list = new ArrayList<>(); 
		for (int i = 0; i < t; i++) {
			list.add(Long.parseLong(br.readLine()));
		}
		
		if (list.get(1) - list.get(0) == list.get(2) - list.get(1)) {
			System.out.println(list.get(t-1) + (list.get(1) - list.get(0)));
		} else {
			System.out.println(list.get(t-1) * (list.get(1) / list.get(0)));
		}
		
	}

}
