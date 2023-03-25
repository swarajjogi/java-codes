import java.util.*;

class A7_02 {
    public static void main(String args[]) {
        // read all element
        System.out.println("iterating the array list:");
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("IT");
        arr1.add("Cse");
        arr1.add("Mech");
        Iterator<String> i = arr1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // add all element to new ArrayList

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("s1");
        arr2.add("s2");

        arr2.addAll(arr1);
        System.out.println("\nadding all element of arr1 in arr2: " + arr2);

        // delete all elements .....arr2
        System.out.println("\ndeleting all the element of arr2:");
        arr2.clear();
        System.out.println(arr2);

        // check whether array list contain all element of second list or not
        ArrayList<String> arr3 = new ArrayList<String>();
        arr3.add("java");
        arr3.add("python");
        arr3.add("c++");
        ArrayList<String> arr4 = new ArrayList<String>();
        arr4.add("python");
        arr4.add("java");
        System.out.println("\nDoes list3 contain list4:" + arr3.containsAll(arr4));
        arr4.add("sql");
        System.out.println("Does list3 contain list4:" + arr3.containsAll(arr4));

        // copy array list to array .........arr4
        System.out.println("\nlist: " + arr4);
        String str[] = new String[arr4.size()];
        arr4.toArray(str);
        System.out.println("copying to array:" + Arrays.toString(str));

        // gettting sublist from array
        ArrayList<String> arr5 = new ArrayList<String>();
        arr5.add("cp");
        arr5.add("sp");
        arr5.add("cc");
        arr5.add("dbe");

        List<String> lst = arr5.subList(0, 3);
        System.out.println("\nsublist of list5:" + lst);

        // reverse array list content ....arr5

        System.out.println("\nbefore reversing:" + arr5);
        Collections.reverse(arr5);
        System.out.println("after reversing:" + arr5);

        // swap two element of array....arr5
        System.out.println("\nBefore swaping:" + arr5);
        Collections.swap(arr5, 0, 2);
        System.out.println("after swaping:" + arr5);

    }
}