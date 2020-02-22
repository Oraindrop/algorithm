package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SquareEyesightTest18242 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		String[][] arr = new String[a][b];
		Set<Integer> xSet = new HashSet<>();
		Set<Integer> ySet = new HashSet<>();
		
		for (int i = 0; i < a; i++) {
			arr[i] = br.readLine().split("");
		}
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (arr[i][j].equals("#")) {
					xSet.add(i);
					ySet.add(j);
				}
			}
		}
		int xMin = Collections.min(xSet);
		int xMax = Collections.max(xSet);
		int yMin = Collections.min(ySet);
		int length = Collections.max(xSet) - Collections.min(xSet) + 1;

		if (arr[xMin][yMin+(length/2)].equals(".")) {
			System.out.println("UP");
		} else if (arr[xMin+(length/2)][yMin].equals(".")) {
			System.out.println("LEFT");
		} else if (arr[xMax][yMin+(length/2)].equals(".")) {
			System.out.println("DOWN");
		} else {
			System.out.println("RIGHT");
		}
	}

}
