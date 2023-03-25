
class Student {
    String Name;
    int Roll_No;
    int age;

    public void Info(String Name, int Roll_no, int age) {
        System.out.println("my name is:" + this.Name);
        System.out.println("Roll number is: " + this.Roll_No);
        System.out.println("my age is: " + this.age);
    }
}

public class Klas {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.Info("Swaraj", 12, 21);

    }

}
