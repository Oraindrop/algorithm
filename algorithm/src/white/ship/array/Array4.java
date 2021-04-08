package white.ship.array;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2, 7, 3, 6, 4, 5};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	// 1~100 까지의 숫자로 구성된 배열을 o(n) 으로 정렬하기
	static int[] solution(int[] arr) {
		boolean[] booleans = new boolean[101];
		
		for (int i : arr) {
			booleans[i] = true;
		}
		
		int index = 0;
		for (int i = 0; i < booleans.length; i++) {
			if (booleans[i]) {
				arr[index++] = i;
			}
		}
		
		return arr;
	}

}
