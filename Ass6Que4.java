
import java.util.*;
import java.io.*;

public class Ass6Que4 {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter writer = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Textfile.txt"));
            ArrayList<String> str = new ArrayList<>();
            String c;
            while ((c = br.readLine()) != null) {
                str.add(c);
            }
            writer = new FileWriter("acb.txt");
            System.out.print("Elements in Input File:");
            System.out.println(str);
            Collections.sort(str);
            System.out.print("Elements in Output File:");
            System.out.print(str);
            for (String s : str) {
                writer.write(s);
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception Handled!");
        } finally {
            System.out.println("\nFinished...");
            if (writer != null) {
                writer.close();
            }
        }
    }
}
