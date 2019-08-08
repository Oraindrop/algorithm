package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class WhatName17350 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		boolean isExist = false;
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			if (s.equals("anj")) isExist = true;
		}
		
		System.out.println(isExist ? "뭐야;" : "뭐야?");

	}

}
