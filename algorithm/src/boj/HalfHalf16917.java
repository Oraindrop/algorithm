package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HalfHalf16917 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());	// 양념가격
		int b = Integer.parseInt(st.nextToken());	// 후라이드 가격
		int c = Integer.parseInt(st.nextToken());	// 반반 가격
		int x = Integer.parseInt(st.nextToken());	// 양념 개수
		int y = Integer.parseInt(st.nextToken());	// 후라이드 개수
		
		int price = 0;
		if (x > y) {
			int half = (y * c) * 2;
			int sauce = a * (x - y);
			int each = (a * x) + (b * y);
			int all = (c * x) * 2;
			price = Math.min(Math.min((half + sauce), each), all);
		} else if (y > x) {
			int half = (x * c) * 2;
			int fried = b * (y - x);
			int each = (a * x) + (b * y);
			int all = (y * c) * 2;
			price = Math.min(Math.min((half + fried), each), all);
		} else {
			int half = (x * c) * 2;
			int each = (a * x) + (b * y);
			price = Math.min(half, each);
		}
		System.out.println(price);
	}
}
