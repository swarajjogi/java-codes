// public class Prime {

//     public static void main(String[] args) {
//         int num = 20;
//         for (int i = 2; i < num / 2; ++i) {
//             if (num % i == 0) {
//                 System.out.println("prime");
//             }
//         }
//     }
// }

// class Prime {
//     public static void main(String[] agrs) {
//         int n = 17;
//         for (int i = 2; i < n; i++) {
//             if (n % i ==0) {
//                 System.out.println("Its a prime number");

//             }
//         }
//     }

// }
package Javaprograms;

class Prime {
    public static void main(String[] args) {
        int b = 10;
        for (int i = 2; i <= b / 2; ++i) {
            if (b % i == 0) {
                System.out.println("prime");
            }
        }

    }
}