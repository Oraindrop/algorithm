package boj;

public class Boj9161 {
	public static void main(String[] args) {
		
		int min = 100;
		int max = 999;
		int div = 111;
		
		StringBuilder sb = new StringBuilder();
		for (int i = min; i <= max; i++) {
			
			for (int j = min; j <= max; j++) {
				
				if (i % div == 0 && j % div == 0) {
					continue;
				}
				
				if ( (i/10) * j == i * (j % 100) && (i % 10 == j / 100) ) {
					sb.append(String.format("%d / %d = %d / %d", i, j, i/10, j % 100)).append(System.lineSeparator());
				}
				
			}
		}
		
		System.out.print(sb.toString());
		
	}
}
