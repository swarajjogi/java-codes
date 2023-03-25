import java.util.Scanner;

public class Sept {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int Alice = S.nextInt();
        int Bob = S.nextInt();
        if (Alice < Bob * 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
