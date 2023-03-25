import java.util.*;

public class List {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int");
        int Marak = sc.nextInt();
        System.out.println("Enter String");
        String Dj = sc.nextLine();

        System.out.println(Dj);
        int[] Marks = new int[Marak];
        Marks[0] = 95;
        Marks[1] = 84;
        Marks[2] = 65;
        int b = sc.nextInt();
        System.out.println(Marks[b]);

    }
}
