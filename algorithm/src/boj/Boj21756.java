package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj21756 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> asis = new ArrayList<>();
		List<Integer> tobe = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			asis.add(i);
		}
		
		while (asis.size() > 1) {
			tobe.clear();
			for (int i = 0; i < asis.size(); i++) {
				if (i % 2 != 0) {
					tobe.add(asis.get(i));
				}
			}
			asis = new ArrayList<Integer>(tobe);
		}
		
		System.out.println(asis.get(0));
	}

}
