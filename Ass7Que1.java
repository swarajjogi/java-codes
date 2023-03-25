import java.util.*;

class Employee {
    String name;
    int id;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "id:" + this.id + " name:" + this.name;
    }

    // hashcode
    public int hashCode() {
        return this.id;
    }

    // equals
    public boolean equals(Object obj) {
        Employee e = null;
        if (obj instanceof Employee) {
            e = (Employee) obj;
        }
        if (this.id == e.id) {
            return true;
        } else {
            return false;
        }
    }

}

public class Ass7Que1 {
    public static void main(String args[]) {
        // iteration through hashset
        System.out.println("iterating the HashSet:");
        HashSet<String> hset = new HashSet<String>();
        hset.add("vijay");
        hset.add("ajay");
        hset.add("sanjay");
        for (String i : hset) {
            System.out.println(i);
        }
        // copy set content of previous to new content
        HashSet<String> h2set = new HashSet<String>();
        h2set.add("IT");
        h2set.add("Cse");

        h2set.addAll(hset);
        System.out.println("\nadding all element of hashset in hashset2:" + h2set);

        // deleting all element of h2set
        System.out.println("\ndeleting all element of Hashset2:");
        h2set.clear();
        System.out.println(h2set);

        // Copy all elements from HashSet to an array...using hset
        System.out.println("\nhashset:" + hset);
        String str[] = new String[hset.size()];
        hset.toArray(str);
        System.out.println("array:" + Arrays.toString(str));

        // compare to set and retain the same
        HashSet<String> h3set = new HashSet<String>();
        h3set.add("apple");
        h3set.add("pineapple");
        h3set.add("custardapple");
        HashSet<String> h4set = new HashSet<String>();
        h4set.add("apple");
        h4set.add("pineapple");
        h4set.add("grapes");

        h3set.retainAll(h4set);
        System.out.println("\nHashset after retaining element common to both side:" + h3set);

        // Eliminate duplicate user defined objects from HashSet...using class Employee
        System.out.println();
        HashSet<Employee> h5set = new HashSet<Employee>();
        h5set.add(new Employee(1, "Prajwal"));
        h5set.add(new Employee(2, "Abhishek"));
        h5set.add(new Employee(3, "parth"));
        h5set.add(new Employee(3, "manthan"));// duplicate element
        System.out.println("\nremoving user defined duplicate element:\n" + h5set);

        // Find user defined objects from HashSet && also delete the user defined
        // object....h5set
        Employee emp = new Employee(2, "Mahesh");
        System.out.println("Does it contain the object : " + h5set.contains(emp));

        h5set.remove(emp);
        System.out.println("\nObject deleted....");
        System.out.println("after deletion:" + h5set);

    }
}
