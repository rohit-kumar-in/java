/*
    Q2; https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
    Input Format

            There are three lines of input:

            The first line contains an integer.
            The second line contains a double.
            The third line contains a String.
            Output Format

            There are three lines of output:

            On the first line, print String: followed by the unaltered String read from stdin.
            On the second line, print Double: followed by the unaltered double read from stdin.
            On the third line, print Int: followed by the unaltered integer read from stdin.
            To make the problem easier, a portion of the code is already provided in the editor.

            Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

*/

import java.util.Scanner;
public class inputOutput2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // taking input
        int integerValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();         // to read leftover space
        String stringValue = scanner.nextLine();

        //print output

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + integerValue);

        scanner.close();

    }

    
}