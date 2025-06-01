package roadmap_topics_practices.basic_programming;

import java.util.*;

class LinkedListManipulation {

    public static void main(String[] args) {
        LinkedList<Integer> myArrayList = new LinkedList<Integer>();

        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        System.out.println(myArrayList.get(3));// output:40
        myArrayList.remove(4);// remove:50
        // myArrayList.clear(); // clear array list
        System.out.println(myArrayList.size());// array list size :4 after removed arrray value
        myArrayList.add(4, 100);// add value with index position
        // ArrayList<Integer> cloneArray = myArrayList.clone();
        System.out.println(myArrayList.hashCode());// hashcode value
        System.out.println(myArrayList.size());
    }
}