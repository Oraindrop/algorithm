package white.ship;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 2, 3, 2, 4, 5, 5, 4 };
		System.out.println(solution(arr));
	}
	
	// 중복이 없는 숫자 찾기
	private static int solution(int[] arr) {
		int number = 0;
		for (int i : arr) {
			number ^= i;
		}
		return number;
	}

}
