package roadmap_topics_practices.data_structure.stack;

import java.util.*;

public class StackCollection {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
