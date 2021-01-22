package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger value = BigInteger.ZERO;
            for (int j = 0; j < n; j++) {
                BigInteger input = new BigInteger(br.readLine());
                value = value.add(input);
            }
            int compare = value.compareTo(BigInteger.ZERO);
            if (compare == 0) {
                sb.append(0);
            } else if (compare > 0) {
                sb.append("+");
            } else {
                sb.append("-");
            }
            sb.append(System.lineSeparator());
        }
        System.out.print(sb.toString());
    }
}
