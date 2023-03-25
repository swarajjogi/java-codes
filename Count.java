
public class Count {

    static int c = 0;

    public Count() {
        c++;
    }

    public static void main(String args[]) {
        Count b1 = new Count();
        Count b2 = new Count();
        Count b3 = new Count();
        Count b4 = new Count();
        System.out.println("Total number of object=" + Count.c);
    }
}
