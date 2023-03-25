package Pack;

class Pass {
    private String Password;

    public String getPassword() {
        return this.Password;
    }

    public static void Marks() {
        System.out.println("We re here");
    }

    public void setPassword(String password) {
        Password = password;
    }

}

class EightJuly {

    public static void main(String args[]) {

        Pass P1 = new Pass();
        P1.Marks();

    }

}
