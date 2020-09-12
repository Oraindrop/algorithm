package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj1269 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int aSize = Integer.parseInt(st.nextToken());
		int bSize = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		Set<Integer> aSet = new HashSet<>();
		for (int i = 0; i < aSize; i++) {
			aSet.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		Set<Integer> bSet = new HashSet<>();
		
		for (int i = 0; i < bSize; i++) {
			bSet.add(Integer.parseInt(st.nextToken()));
		}
		
		Set<Integer> diffSet = new HashSet<Integer>();
		
		for (int a : aSet) {
			if (!bSet.contains(a)) {
				diffSet.add(a);
			}
		}
		
		for (int b : bSet) {
			if (!aSet.contains(b)) {
				diffSet.add(b);
			}
		}
		
		System.out.println(diffSet.size());
	}

}
