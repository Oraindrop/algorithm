package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj1362 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		int index = 0;
		while (!input.equals("0 0")) {
			index++;
			sb.append(index).append(" ");
			int base = Integer.parseInt(input.split(" ")[0]);
			int cur = Integer.parseInt(input.split(" ")[1]);
			String line = br.readLine();
			List<String> list = new ArrayList<>();
			while (!line.equals("# 0")) {
				list.add(line);
				line = br.readLine();
			}
			
			boolean dead = false;
			for (String s : list) {
				String op = s.split(" ")[0];
				int n = Integer.parseInt(s.split(" ")[1]);
				if (op.equals("E")) {
					cur -= n;
					if (cur <= 0) {
						dead = true;
						break;
					}
				} else {
					cur += n;
				}
			}
			
			if (dead) {
				sb.append("RIP");
			} else {
				sb.append( (base / 2 < cur && base * 2 > cur) ? ":-)" : ":-(");
			}
			sb.append(System.lineSeparator());
			
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
