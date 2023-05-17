package revisionPrograms;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(2,6);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(1));


    }
}
