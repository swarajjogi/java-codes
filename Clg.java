
final class College {
    public College() {
        System.out.println("I am in college");
    }
}

class Lab extends College {
    public Lab() {
        System.out.println("I am in CP lab");
    }
}

class Clg {
    public static void main(String args[]) {
        College C = new College();
        Lab L = new Lab();
    }
}