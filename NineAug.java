public class NineAug {
    public static void main(String args[]) {
        Pattern1(4);
        System.out.println();
        Pattern2(4);
    }

    public static void Pattern1(int n) {

        for (int row = 1; row <= n; row++) {
            for (int clm = 1; clm <= row; clm++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    public static void Pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int clm = 1; clm <= n; clm++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

}
