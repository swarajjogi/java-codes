// import javax.tools.ForwardingFileObject;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Pattern 1 ");
        Pattern1(4);
        System.out.println("Pattern 2");
        Pattern2(5);
        System.out.println("Pattern 3");
        Pattern3(5);
        System.out.println("Pattern 4");
        Pattern4(5);
        System.out.println("Pattern 5");
        Pattern5(5);
    }

    static void Pattern1(int n) {
        for (int vertical = 1; vertical <= n; vertical++) {
            for (int horizontal = 1; horizontal <= n; horizontal++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        for (int vertical = 1; vertical <= n; vertical++) {
            for (int horizontal = 1; horizontal <= vertical; horizontal++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        for (int vertical = 1; vertical <= n; vertical++) { // 1
            for (int horizontal = 1; horizontal <= n - vertical + 1; horizontal++) { // 5-1+1 = 5
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        for (int vertical = 1; vertical <= n; vertical++) {
            for (int horizontal = 1; horizontal <= vertical; horizontal++) {
                System.out.print(horizontal + " ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {
        for (int vertical = 1; vertical <= n; vertical++) {
            for (int horizontal = 1; horizontal <= vertical; horizontal++) {
                System.out.print(horizontal + " ");
            }
            System.out.println();
        }
        for (int vertical = 0; vertical <= n; vertical++) {
            for (int horizontal = 1; horizontal <= n - vertical + 1; horizontal++) {
                System.out.print(horizontal + " ");
            }
            System.out.println();
        }
    }
}
