package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class OvenWatch2525 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		LocalTime lt = LocalTime.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		int min = Integer.parseInt(br.readLine());
		
		System.out.println(lt.plusMinutes(min).format(DateTimeFormatter.ofPattern("H m")));
	}
}
