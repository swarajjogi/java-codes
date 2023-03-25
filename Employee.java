public class Employee {
    private int id;
    private String name;

    public Employee() {
        id = 1;
        name = "A";
    }

    public Employee(Employee employee) {
        this.id = employee.id;
        this.name = employee.name;
    }

    void display() {
        System.out.println("id:" + id + " name:" + name);
    }

    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.display();
        Employee e2 = new Employee(e1);
        e2.display();
    }
}
