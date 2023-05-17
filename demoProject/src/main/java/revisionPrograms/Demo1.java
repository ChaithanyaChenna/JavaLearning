package revisionPrograms;

import javatpointPrograms.Demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1  {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        //int a[]=new int[3];
        int a[]={1,2,3};
       // String str[]=new String[3];
        String str1[]={"Apple","Banana","grapes"};
       // System.out.println(str1);

       List list1= Arrays.asList(str1);
       System.out.println(list1);

     Object aq[]=   list1.toArray();
        System.out.println(aq[0]);
        ArrayList<Integer> ab=new ArrayList<>();
        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(4);
        ab.add(5);

        System.out.println(ab.get(0));

        System.out.println(ab.size());




    }
}
