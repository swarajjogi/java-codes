
abstract class Animal {
    abstract void sound();

    public void eat() {
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("bark bark!");
    }
}

public class Ass4que5 {
    public static void main(String args[]) {
        Dog a = new Dog();
        a.eat();
        a.sound();
    }
}
