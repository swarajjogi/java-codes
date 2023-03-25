public class ArraySum {
    public static void main(String args[]) {
        int a[] = { 5, 1, 3, 4 };

        int b[] = a.sort();
        System.out.println(b);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {

            sum = sum + a[i];

        }
        System.out.println(sum);
    }

}
