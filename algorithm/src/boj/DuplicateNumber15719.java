package boj;

public class DuplicateNumber15719 {

	private static byte[] buffer = new byte[78888905];
	private static int next; 
	private static byte b;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.in.read(buffer, 0, buffer.length);
		
		long n = nextInt();
		long sum = 0;
		
		for (int i = 0; i < n; i++) {
			long value = nextInt();
			sum += value;
		}
		
		System.out.println(sum - (n * (n-1) / 2));
	}
	
	private static long nextInt() {
		long n = buffer[next++] - '0';
		while ((b = buffer[next++]) >= '0')
			n = (n * 10) + (b - '0');
		return n;
	}

}
