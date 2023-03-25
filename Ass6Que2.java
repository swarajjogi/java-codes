import java.util.*;

public class Ass6Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the string :");
            String a = sc.nextLine();
            String b = "Witsolapur";
            if (a.equals(b)) {
                System.out.println("String Matched");
            } else {
                throw new Exception("String does not match");
            }
        } catch (Exception e) {
            System.out.println("Exception Handeled in Main");
        } finally {
            System.out.println("Exit Main");

        }

    }

}
