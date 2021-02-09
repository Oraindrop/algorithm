package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj6324 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			sb.append(String.format("URL #%d", (i+1))).append(System.lineSeparator());
			String input = br.readLine();
			String[] protocols = input.split("://");
			sb.append("Protocol = ").append(protocols[0]).append(System.lineSeparator());
			
			input = input.substring(protocols[0].length() + 3);
			String[] arr = input.split(":");
			
			if (arr[0].indexOf("/") == -1 && arr.length > 1) {
				sb.append("Host     = ").append(arr[0]).append(System.lineSeparator());
				input = input.substring(arr[0].length() + 1);
				String[] temp = input.split("/");
				sb.append("Port     = ").append(temp[0]).append(System.lineSeparator());
				if (temp.length > 1) {
					sb.append("Path     = ").append(input.substring(temp[0].length() + 1)).append(System.lineSeparator());
				} else {
					sb.append("Path     = <default>").append(System.lineSeparator());
				}
			} else {
				String[] temp = input.split("/");
				sb.append("Host     = ").append(temp[0]).append(System.lineSeparator());
				sb.append("Port     = <default>").append(System.lineSeparator());
				if (temp.length > 1) {
					sb.append("Path     = ").append(input.substring(temp[0].length() + 1)).append(System.lineSeparator());
				} else {
					sb.append("Path     = <default>").append(System.lineSeparator());
				}
			}
			
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
