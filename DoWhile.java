//

import java.util.Scanner;

public class DoWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Enter any number: ");

            num = sc.nextInt();
            num = num + 1;

        } while (num < 100);

    }
}
/*
 * // Program to display numbers from 1 to 5
 * 
 * class Main {
 * public static void main(String[] args) {
 * 
 * // declare variables
 * int i = 1, n = 5;
 * 
 * // while loop from 1 to 5
 * while(i <= n) {
 * System.out.println(i);
 * i++;
 * }
 * }
 * }
 */