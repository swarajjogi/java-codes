import java.util.*;

class FehToCel {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit degree:");
        float f = sc.nextFloat();
        float c;
        c = (((f - 32) * 5) / 9);
        System.out.println(f + "farenheit = " + c + " celsius");

    }
}
