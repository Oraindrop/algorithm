package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Boj2226 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		List<BigInteger> list = new ArrayList<>();
		BigInteger two = new BigInteger("2");
		list.add(BigInteger.ZERO);
		list.add(BigInteger.ZERO);
		list.add(BigInteger.ONE);
		list.add(BigInteger.ONE);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.parseInt(br.readLine());
		for (int i = 4; i <= max; i++) {
			list.add(list.get(i-2).add(two.pow(i-3)));
		}
		
		System.out.println(list.get(max));
	}

}
