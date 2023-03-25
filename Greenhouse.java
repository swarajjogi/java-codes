
//Example of overloaded constructors

class Light {
    // Fields
    int noOfWatts; // wattage
    boolean indicator; // on or off
    String location; // placement

    // Explicit Default Constructor
    Light() { // (1)
        noOfWatts = 50;
        indicator = true;
        location = "X";
    }

    // Non-default Constructor
    Light(int noOfWatts, boolean indicator, String location) { // (2)
        this.noOfWatts = noOfWatts;
        this.indicator = indicator;
        this.location = location;
    }
}

public class Greenhouse {
    public static void main(String[] args) {
        Light moreLight = new Light(100, true, "Greenhouse");
        Light firstLight = new Light();
    }
}
