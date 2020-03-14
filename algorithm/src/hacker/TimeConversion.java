package hacker;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
    	String[] arr = s.split(":");
    	String a = arr[2].substring(2);
    	LocalDateTime ldt = LocalDateTime.of(2020, 3, 14, Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2].substring(0, 2)));
    	if (a.equals("PM") && !arr[0].equals("12")) {
    		ldt = ldt.plusHours(12);
    	} else if (a.equals("AM") && arr[0].equals("12")) {
    		ldt = ldt.minusHours(12);
    	}
		return ldt.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public static void main(String[] args) throws IOException {
    	System.out.println(timeConversion("12:05:45PM"));
    }
}
