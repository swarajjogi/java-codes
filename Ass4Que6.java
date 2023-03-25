
class Outerclass {
    public int a = 10;

    class Innerclass {
        public int b = 5;
    }
}

public class Ass4Que6 {
    public static void main(String[] args) {
        Outerclass out = new Outerclass();
        Outerclass.Innerclass in = out.new Innerclass();
        System.out.println(in.b + out.a);
    }
}
