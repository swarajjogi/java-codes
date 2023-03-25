// public class TenAug {
//     public static void main(String[] args) {
//         Pattern1();
//     }

//     static void Pattern1() {
//         // row
//         for (int row = 1; row <= 4; row++) {
//             // column
//             for (int clm = 1; clm <= 4 - row + 1; clm++) {

//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
public class TenAug {
    public static void main(String args[]) {

        Pattern1(5);
    }

    public static void Pattern1(int n) {

        for (int row = 1; row <= n; row++) {
            for (int clm = 1; clm <= row; clm++) { // clm = 1 ;
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
