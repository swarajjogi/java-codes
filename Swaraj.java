package Javaprograms;

import java.util.*;

class Swaraj {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            System.out.print("You have entered: " + str);
        }
    }
}

// import java.util.*;
// class UsingScan
// {
// public static void main(String[] args)
// {
// Scanner sc= new Scanner(System.in); //System.in is a standard input stream
// System.out.print("Enter first number- ");
// String a= sc.nextString();
// System.out.print("Enter second number- ");
// int b= sc.nextInt();
// System.out.print("Enter third number- ");
// int c= sc.nextInt();
// int d=a+b+c;
// System.out.println("Total= " +d);
// }
// }