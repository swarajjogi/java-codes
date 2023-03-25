
import java.util.*;
import java.io.*;

public class Ass6Que5 {
    public static void main(String[] args) throws IOException {
        File in = new File("Five1.txt");
        FileWriter writer = null;
        try {
            FileReader fr = new FileReader(in);
            ArrayList<Integer> chr = new ArrayList<Integer>();
            int c;
            while ((c = fr.read()) != -1) {
                chr.add(c);
                System.out.print((char) c + "");
            }
            writer = new FileWriter("Five.txt");
            System.out.printf("\nNew File Contents are...\n");
            for (int s : chr) {
                if ((s >= 65 && s <= 90) || s == 32) {
                    writer.write((char) s);
                    System.out.print((char) s);
                } else if (s <= 122 && s >= 97) {
                    s = s - 32;
                    System.out.print((char) s);
                    writer.write((char) s);
                } else if (s < 65) {
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception Handled!");
        } finally {
            System.out.printf("\nFinished...");
            if (writer != null) {
                writer.close();
            }
        }
    }
}
