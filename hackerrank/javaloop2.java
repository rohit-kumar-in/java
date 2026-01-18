/*
        Q3: https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

*/

import java.util.Scanner;
public class javaloop2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfQueries = scanner.nextInt();

        for(int i = 0; i<numberOfQueries; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int result = a;
            for(int j = 1; j<=n ; j++){
                result = result+ (int)(Math.pow(2, (j-1))*b);

                System.out.print(result + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}