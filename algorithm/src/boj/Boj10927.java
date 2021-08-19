package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Boj10927 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(input.getBytes());
        byte byteData[] = md.digest();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println(sb.toString());
	}

}
