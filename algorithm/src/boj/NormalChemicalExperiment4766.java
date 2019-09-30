package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NormalChemicalExperiment4766 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double pre = Double.parseDouble(br.readLine());
		double cur = 0;
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		while(!s.equals("999")) {
			cur = Double.parseDouble(s);
			sb.append(String.format("%.2f", cur-pre)).append(System.lineSeparator());
			pre = cur;
			s = br.readLine();
		}
		System.out.println(sb.toString());
	}

}
