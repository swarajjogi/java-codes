import java.util.*;

import javax.annotation.processing.SupportedOptions;

public class Practice {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();
        System.out.println("Enter the third number");
        int c = s.nextInt();
        if (b < a && c < a) {
            System.out.println("A is greater ");

        }
        if (a < b && c < b) {
            System.out.println("b is graeter ");
        }
        if (a < c && b < c) {
            System.out.println("C is grater");
        }
    }
}
