package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj5635 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<StudentWithDate> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(StudentWithDate.of(br.readLine()));
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(n-1).getName());
		System.out.println(list.get(0).getName());
	}

}

class StudentWithDate implements Comparable<StudentWithDate>{
	
	private String name;
	
	private LocalDate birthDate;

	public StudentWithDate(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public static StudentWithDate of(String input) {
		String[] arr = input.split(" ");
		String name = arr[0];
		LocalDate birthDate = LocalDate.of(Integer.parseInt(arr[3]), Integer.parseInt(arr[2]), Integer.parseInt(arr[1]));
		return new StudentWithDate(name, birthDate);
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(StudentWithDate o) {
		// TODO Auto-generated method stub
		if (this.birthDate.isBefore(o.birthDate)) return -1;
		if (this.birthDate.isAfter(o.birthDate)) return 1;
		return 0;
	}
}
