
import java.util.*;

class Fibonacci {
    static int fib(int n) {
        if (n == 0 || n == 1)
            return 0;
        else if (n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        int n = 9;
        System.out.println(fib(n));
    }
}

public class Fibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any text or some thing");
        String a = s.nextLine();
        System.out.println("How many times do you want to print this sentence");
        int b = s.nextInt();
        System.out.println(a);
        for (int i = 1; i < b; i++) {
            System.out.println(a);
        }
    }
}
