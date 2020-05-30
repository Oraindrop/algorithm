package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        long sum = 0;

        for (String s : arr) {
            long value = Long.parseLong(s);
            sum += value * value;
        }

        System.out.println(sum % 10);
    }
}
