package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CrossWordMaker2804 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
				
		int aSize = a.length();
		int bSize = b.length();
		
		int index = findKeyIndex(a, b);
		
		String[][] arr = new String[bSize][aSize];
		initArr(aSize, bSize, arr);
		
		for (int i = 0; i < bSize; i++) {
			arr[i][index] = b.substring(i, i+1);
		}
		
		index = b.indexOf(a.substring(index, index+1));
		
		for (int i = 0; i < aSize; i++) {
			arr[index][i] = a.substring(i, i+1);
		}
		
		for (int i = 0; i < bSize; i++) {
			for (int j = 0; j <aSize; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

	private static int findKeyIndex(String a, String b) {
		for (int i = 0; i < a.length(); i++) {
			String value = a.substring(i, i+1);
			if (b.contains(value)) {
				return i;
			}
		}
		// untouchable
		return -1;
	}

	private static void initArr(int aSize, int bSize, String[][] arr) {
		for (int i = 0; i < bSize; i++) {
			for (int j = 0; j < aSize; j++) {
				arr[i][j] = ".";
			}
		}
	}

}
