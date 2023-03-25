
public class Ass5Que2 implements A, B {
    public void show() {
        A.super.show();
        B.super.show();
    }

    public static void main(String[] args) {
        Ass5Que2 t = new Ass5Que2();
        t.show();
    }
}

interface A {
    default void show() {
        System.out.println("This is interface A. ");
    }
}

interface B {
    default void show() {
        System.out.println("This is interface B.");
    }
}
