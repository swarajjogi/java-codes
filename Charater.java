import java.util.*;

//write a code to calculate sum of array?
public class Charater {
    public static void main(String args[]) {
        String str = "Hello! How are you?";
        boolean hasSpecialChar = false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                hasSpecialChar = true;
                break;
            }
        }
        if (hasSpecialChar) {
            System.out.println("The string contains special characters.");
        } else {
            System.out.println("The string does not contain special characters.");
        }
    }
}