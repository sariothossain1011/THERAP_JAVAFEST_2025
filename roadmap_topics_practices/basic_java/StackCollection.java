package roadmap_topics_practices.basic_java;

import java.util.*;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>(); // FIFO

        stack.add("a");
        stack.add("b");
        stack.add("c");
        stack.add("d");
        stack.add("e");

        stack.push("f");// add eletemet
        stack.pop();// delete last element
        System.out.println(stack.search("d"));//search element
         System.out.println(stack.peek());// peck fist element

        System.out.println(stack);

    }
}
