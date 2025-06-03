package roadmap_topics_practices.data_structure.queue;

import java.util.*;

public class QueueCollection {

    public static void main(String[] args) {

        // Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }

    }
}
