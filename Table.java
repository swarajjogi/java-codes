import java.util.Scanner;

public class Table {
    public static void main(String args[]) {
        int c = 1;
        while (c < 10) {
            System.out.println(c);
            c++;
        }

        Two();
    }

    static public void Two() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}
