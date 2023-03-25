
public class Pattern {
    public static void main(String args[]) {
        Oneline(4);

    }

    static void Oneline(int n) {
        for (int row = 1; row <= n; row++) {
            for (int clm = 1; clm <= row; clm++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
