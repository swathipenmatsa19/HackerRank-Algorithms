/*


Given a time in -hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock. 
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.


*/


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         
         int hh = Integer.parseInt(s.substring(0,2));
         //String h = new String();
         String mm = s.substring(3,5);
         String ss = s.substring(6,8);
         String ampm = s.substring(8,10);
         if(ampm.equals("AM") && hh == 12)
            hh = 0;
         else if(ampm.equals("PM") && hh < 12) {
            hh += 12;
           // h += hh;
         }
         
         return String.format("%02d",hh) + ":" + mm + ":" + ss;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}








