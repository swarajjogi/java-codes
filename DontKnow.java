import javax.sound.sampled.SourceDataLine;

public class DontKnow {
    public static void main(String args[]) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
        System.out.println("pattern 2");
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }

}
