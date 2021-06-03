package boj;

public class Boj11059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = new long[100];
		long[] arr2 = new long[100];
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		
		for (int i = 3; i < 100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for (int i = 1; i < 100; i++) {
			arr2[i] = (arr2[i-1] % 1000000007 + ((arr[i] % 1000000007) * (arr[i] % 1000000007)) % 1000000007) % 1000000007;
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println(arr2[i]);
		}
	}

}
