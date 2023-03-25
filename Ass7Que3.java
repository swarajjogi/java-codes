import java.util.*;

class Price {
    int pr;
    String name;

    Price(int pr, String name) {
        this.pr = pr;
        this.name = name;
    }

    public String toString() {
        return "name:" + this.name + " price:" + this.pr;
    }

    // hashcode
    public int hashCode() {
        return this.pr;
    }

    // equals
    public boolean equals(Object obj) {
        Price e = null;
        if (obj instanceof Price) {
            e = (Price) obj;
        }
        if (this.pr == e.pr) {
            return true;
        } else {
            return false;
        }
    }

}

public class Ass7Que3 {
    public static void main(String args[]) {
        // iteration through hashset
        System.out.println("iterating the HashMap:");
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("first", "code");
        hm.put("second", "compile");
        hm.put("third", "run");
        for (String i : hm.keySet()) {
            System.out.println("key:" + i + ", value:" + hm.get(i));
        }

        // Copy Map content to another HashMap.
        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm.put("rose", "red");
        hm.put("sunflower", "yellow");
        hm2.putAll(hm);
        System.out.println("\ncopying content from hm to hm2:\n" + hm2);

        // Search a key in HashMap
        System.out.println("\nDoes it contain key rose:" + hm2.containsKey("rose"));

        // Search a value in HashMap
        System.out.println("\nDoes it contain value run:" + hm2.containsValue("run"));

        // get all keys from HashMap
        System.out.println("\nall keys of second hashmap:");
        for (String i : hm2.keySet()) {
            System.out.println(i);
        }

        // Delete all elements from HashMap.
        hm2.clear();
        System.out.println("\nafter deletion of all element:\n" + hm2);

        // Eliminate duplicate user defined objects as a key from HashMap.
        HashMap<Price, String> hm3 = new HashMap<Price, String>();
        hm3.put(new Price(60, "banana"), "banana");
        hm3.put(new Price(70, "grape"), "grape");
        hm3.put(new Price(150, "apple"), "apple");
        hm3.put(new Price(70, "grape"), "grape");// duplicate
        System.out.println("\nHashMap after removing user defined element:\n" + hm3);

        // finding user defined object && deleting the object
        Price p = new Price(60, "banana");
        System.out.println("\nDoes list contain this pair:" + hm3.containsKey(p));

        hm3.remove(p);
        System.out.println("\nHashMap After deleting the object:\n" + hm3);

    }
}
