import java.util.*;

public class Ass6Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String a = sc.nextLine();
        System.out.print("Entered String is : " + a);
        try {
            if (a.length() < 15) {
                return;
            } else {
                throw new lengthException("Length is greater than 15");
            }
        } catch (lengthException e) {
            System.out.println("\nException Handeled in Main");
        } finally {
            System.out.println("\nExit Main");
        }

    }
}

class lengthException extends Exception {
    lengthException(String str) {
        super(str);
    }
}
