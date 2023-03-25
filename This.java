
// class Pen {
//     String color;

//     public void write() {
//         System.out.println("Writing something: ");
//     }

//     public void printcolor() {
//         System.out.println(this.color);
//     }

//     public class This {
//         public static void main(String[] args) {
//             Pen pen1 = new Pen();
//             pen1.color = "Blue";
//             Pen pen2 = new Pen();
//             pen2.color = "Black";

//             pen1.printcolor();
//             pen2.printcolor();
//         }
//     }
// }
class Pen {
    String color;

    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
    }
}

public class This {

    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.color = "blue";
        Pen p2 = new Pen();
        p2.color = "black";
        Pen p3 = new Pen();
        p3.color = "red";
        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}
