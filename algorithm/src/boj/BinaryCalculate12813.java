package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryCalculate12813 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split("");
		String[] b = br.readLine().split("");

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < a.length; i++) {
			boolean boolA = convertBoolean(a[i]);
			boolean boolB = convertBoolean(b[i]);
			sb.append(convertString(boolA & boolB));
		}
		sb.append(System.lineSeparator());
		
		for (int i = 0; i < a.length; i++) {
			boolean boolA = convertBoolean(a[i]);
			boolean boolB = convertBoolean(b[i]);
			sb.append(convertString(boolA | boolB));
		}
		sb.append(System.lineSeparator());

		for (int i = 0; i < a.length; i++) {
			boolean boolA = convertBoolean(a[i]);
			boolean boolB = convertBoolean(b[i]);
			sb.append(convertString(boolA ^ boolB));
		}
		sb.append(System.lineSeparator());

		for (int i = 0; i < a.length; i++) {
			boolean boolA = convertBoolean(a[i]);
			sb.append(convertString(!boolA));
		}
		sb.append(System.lineSeparator());

		for (int i = 0; i < a.length; i++) {
			boolean boolB = convertBoolean(b[i]);
			sb.append(convertString(!boolB));
		}

		System.out.println(sb.toString());
		
	}
	
	static boolean convertBoolean(String str) {
		return str.equals("1");
	}
	
	static String convertString(boolean bool) {
		return bool ? "1" : "0";
	}

}
