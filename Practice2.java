
import java.util.*;
import java.util.Scanner;

public class Practice2 {
    public static void main(String args[]) {

        {
            // your code goes here
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            for (int i = 0; i < a; i++) {
                int x = s.nextInt();

                if (x < 7) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
    }

    // Scanner in = new Scanner(System.in);
    // char ch = in.next().trim().charAt(0);

    // if (ch >= 'a' && ch <= 'z') {
    // System.out.println("Lower case ");

    // } else
    // System.out.println("upper case ");
}
