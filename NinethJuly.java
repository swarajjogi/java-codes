package Javaprograms;

class Something {
    private String Password;

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String paas) {
        this.Password = paas;
    }
}

public class NinethJuly {
    public static void main(String args[]) {
        Something s1 = new Something();
        s1.setPassword("abcd");
        System.out.println(s1.getPassword());
    }

}
