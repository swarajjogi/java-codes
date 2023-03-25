import java.util.*;

public class Ass6Quee1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the numbers in array :- ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("\nSorted Elements are :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        try {
            arr[7] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array index is out of bound");
        }
        sc.close();
    }

}
