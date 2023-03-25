class Ass5Que1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        E_Car e_Car = new E_Car();
        vehicle.go();
        car.go();
        car.name("Scorpio");
        e_Car.name("Mustang");
        e_Car.battery(3500.00);
    }
}

class Vehicle {
    String name;

    void go() {
        System.out.println("Vehicle can go ");
    }
}

class Car extends Vehicle {
    void name(String name) {
        System.out.println("Name of car is : " + name);
    }

    void go() {
        System.out.println("Car can go ");
    }
}

class E_Car extends Car {
    void name() {
        System.out.println("Name of E_car is: " + name);
    }

    void battery(double capacity) {
        System.out.println("Battery is : " + capacity);
    }
}