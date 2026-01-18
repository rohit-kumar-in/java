/*
        In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

        Input Format

            There are  lines of input, and each line contains a single integer.

            Sample Input

            42
            100
            125
            Sample Output

            42
            100
            125

*/

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the nuumber1");
        int firstNumber = scanner.nextInt();
        System.out.println("please enter number2");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter the number3");
        int thirdNumber = scanner.nextInt();

        // Printing the output

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        scanner.close();

    }
    
}
