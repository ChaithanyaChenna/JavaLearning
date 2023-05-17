package com.collections;

import java.util.LinkedList;

public class ConvertLinkedListToAray {
    public static void main(String args[])
    {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Object[] obj= list.toArray();
       System.out.println(obj);
        System.out.println(obj.length);
      /*  for(int i=0;i<obj.length;i++)
        {
            System.out.println(obj[i]);
        }*/

        for (Object a:obj){
            System.out.println(a);
        }

        }
    }

