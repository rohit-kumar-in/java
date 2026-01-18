//Write a program to print 2^n where n is input taken by user
/* 

import java.util.Scanner;
public class power {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;
        for(int i = 0; i <number ; i++ ){
            result = result*2;

        }
        System.out.print(result);
        scanner.close();

    }
    
}
*/

import java.util.Scanner;
public class power{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intVaule = scanner.nextInt();

        System.out.println(Math.pow(2, intVaule));
        scanner.close();
    }
}