
import java.util.*;

public class Ass4Que2 {
    int hours;
    int minutes;
    int seconds;

    Ass4Que2(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Ass4Que2(int s) {
        seconds = s % 60;
        hours = s / 60;
        minutes = hours % 60;
        hours = hours / 60;
    }

    public void display() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String args[]) {
        Ass4Que2 A = new Ass4Que2(2, 20, 45);
        A.display();
        Ass4Que2 A1 = new Ass4Que2(7234);
        A1.display();
    }
}
