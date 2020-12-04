package boj;

public class Boj4690 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= 100; i++) {
			int value = i*i*i;
			loop(sb, i, value);
		}
		
		System.out.print(sb.toString());
	}
	
	static void loop(StringBuilder sb, int a, int value) {
		for (int b = 2; b < a; b++) {
			int b3 = b*b*b;
			for (int c = b+1; c < a; c++) {
				int c3 = c*c*c;
				if (b3 + c3 < value) {
					for (int d = c+1; d < a; d++) {
						int d3 = d*d*d;
						if (b3 + c3 + d3 == value) {
							addString(sb, a, b, c, d);
							break;
						}
						
						if (b3 + c3 + d3 > value) {
							break;
						}
					}
				}
			}
		}
	}
	
	static void addString(StringBuilder sb, int a, int b, int c, int d) {
		sb.append("Cube = ").append(a)
			.append(", Triple = (")
			.append(b).append(",")
			.append(c).append(",")
			.append(d).append(")")
			.append(System.lineSeparator());
	}

}
