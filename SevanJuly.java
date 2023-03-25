package Javaprograms;

class Student {
    String name;
    int Age;
    int roll_no;

    public void write() {
        System.out.println("We are here to help you!");
    }

}

class Swaraj {
    String name = "swaraj";
    int roll_no = 21;
    int age = 20;

    public void Name() {
        System.out.println("This is the name of swaraj " + this.name);
    }

}

public class SevanJuly {
    public static void main(String Args[]) {
        Student s1 = new Student(); // this is a object
        s1.name = "Swaraj";
        System.out.println("We are here " + s1.name);

        Swaraj b1 = new Swaraj(); // This is a object
        System.out.println("Name is: " + b1.name);

        s1.write();
        b1.Name();

    }

}
