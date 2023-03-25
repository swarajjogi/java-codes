import java.util.*;

class Tax {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sales tax:");
        double T = sc.nextDouble();
        System.out.printf("sales tax with 2 decimal points : %.2f", T);

    }
}
