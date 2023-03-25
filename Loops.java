package Javaprograms;

public class Loops {
    public static void main(String[] args) {
        // using for loop
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // using while loop
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i = i + 1;
        }

        // using do while loop

        do {
            System.out.println(i);
            i = i + 1;
        } while (i < 11);
    }

}
