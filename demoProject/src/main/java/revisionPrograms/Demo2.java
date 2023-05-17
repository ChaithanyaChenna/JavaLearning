package revisionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        /*for(Integer a:list)
        {
            System.out.println(a);
        }*/


        Iterator itr=list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        list.add(3,5);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.isEmpty());

    }
}
