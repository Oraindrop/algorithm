package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Unique5533 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Scores> list = new ArrayList<>();
		int arr1[] = new int[101];
		int arr2[] = new int[101];
		int arr3[] = new int[101];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr1[a]++;
			arr2[b]++;
			arr3[c]++;
			list.add(new Scores(a, b, c));
		}
		
		for (Scores s : list) {
			System.out.println(s.sum(arr1, arr2, arr3));
		}
	}
}

class Scores {
	private int first;
	private int second;
	private int third;
	
	public Scores(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public int sum(int[] arr1, int[] arr2, int[] arr3) {
		return (arr1[this.first] > 1 ? 0 : this.first) + 
				(arr2[this.second] > 1 ? 0 : this.second) + 
				(arr3[this.third] > 1 ? 0 : this.third);
	}
}
