class Shape {
    public void Area(float x, float y) {
        System.out.println("The area of rectangle=" + (x * y) + "sq unit");
    }

    public void Area(float x) {
        System.out.println("The area of circle=" + (3.142 * x * x) + "squnit");
    }

    public void Area(double x) {
        System.out.println("The area of Square=" + (x * x) + "sq unit");
    }
}

public class Ass4Que8 {
    public static void main(String args[]) {
        Shape s = new Shape();
        s.Area(3, 9);
        s.Area(15);
        s.Area(5.000);
    }
}