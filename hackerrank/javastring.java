/*
    Date = 18 jan 2026
    probleam : https://www.hackerrank.com/challenges/java-int-to-string/
    Author : Rohit Kumar;

*/

import java.util.Scanner;
public class javastring {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        int length = first.length()+second.length();

        first = first.substring(0,1).toUpperCase()+first.substring(1);
        second = second.substring(0,1).toUpperCase()+second.substring(1);


        //First output
        System.out.println(length);
        //Second output
        if (first.compareTo(second)>0){
            System.out.println("Yes");
        } else
            System.out.println("No");

        //Third output    
        System.out.println(first + " " + second);
      //  System.out.println(second);
        scanner.close();

    }
    
}
