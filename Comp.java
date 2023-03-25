import java.util.*;

public class Comp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("\nLarger number:" + a);
            System.out.println("Smaller number:" + b);
        } else {
            System.out.println("\nLarger number:" + b);
            System.out.println("Smaller number:" + a);
        }
    }
}
