package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tallest11292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			List<Person> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(Person.of(br.readLine()));
			}
			Collections.sort(list);
			print(sb, list);
			n = Integer.parseInt(br.readLine());
		}
		
		System.out.print(sb.toString());
	}
	
	static void print(StringBuilder sb, List<Person> list) {
		double max = list.get(list.size() - 1).getHeight();
		for (Person p : list) {
			if (p.getHeight() == max) {
				sb.append(p.getName()).append(" ");
			}
		}
		sb.append(System.lineSeparator());
	}

}

class Person implements Comparable<Person> {

	private String name;
	
	private double height;
	
	public static Person of(String input) {
		String[] arr = input.split(" ");
		Person person = new Person();
		person.name = arr[0];
		person.height = Double.parseDouble(arr[1]);
		return person;
	}
	
	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Double.valueOf(this.height).compareTo(Double.valueOf(o.height));
	}
	
}
