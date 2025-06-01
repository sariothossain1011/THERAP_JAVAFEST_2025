package roadmap_topics_practices.basic_programming;

import java.util.*;

public class ReversArrayList {

    public ArrayList<Integer> revArrayList(ArrayList<Integer> arrList) {

        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = arrList.size() - 1; i >= 0; i--) {
            revArrayList.add(arrList.get(i));
        }
        return revArrayList;

    }

    public static void main(String[] args) {
        ReversArrayList obj = new ReversArrayList();

        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        System.out.println(myArrayList);
        System.out.println(obj.revArrayList(myArrayList));

        List<Integer> sl = myArrayList.subList(0, 3);
        System.out.println("Sub list: "+sl );
    }
}
