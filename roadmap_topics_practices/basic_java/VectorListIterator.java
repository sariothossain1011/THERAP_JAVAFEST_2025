package roadmap_topics_practices.basic_java;

import java.util.*;

public class VectorListIterator {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<String>();

        fruits.add("Zero");
        fruits.add("Two");
        fruits.add("Three");
        fruits.add("Four");
        fruits.add("Five");
        fruits.add("Six");
        fruits.remove("Six");
        fruits.set(0, "One");
        System.out.println(fruits);

        // for(int i=fruits.size()-1;i>=0;i--){
        //     System.out.println(fruits.get(i));
        // }

        ListIterator<String> fruitsIterator = fruits.listIterator(fruits.size());

        while (fruitsIterator.hasPrevious()) {
            System.out.println(fruitsIterator.previous());
        }

    }
}
