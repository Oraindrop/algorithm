package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

public class Boj15080 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " : ");
		LocalDateTime a = LocalDateTime.of(2021, 4, 3, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		st = new StringTokenizer(br.readLine(), " : ");
		LocalDateTime b = LocalDateTime.of(2021, 4, 3, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		
		if (a.isAfter(b)) {
			b = b.plusDays(1l);
		}
		
		Duration duration = Duration.between(a, b);
		System.out.println(duration.getSeconds());
	}

}
