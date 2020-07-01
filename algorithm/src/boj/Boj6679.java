package boj;

public class Boj6679 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1000; i < 10000; i++) {
			int a = go(i, 10);
			int b = go(i, 12);
			int c = go(i, 16);
			
			if (a == b && b == c) {
				sb.append(i).append(System.lineSeparator());
			}
		}
		
		System.out.println(sb.toString());
	}
	
	static int go(int value, int base) {
		int sum = 0;
		while (value > 0) {
			sum += value % base;
			value /= base;
		}
		return sum;
	}
}


