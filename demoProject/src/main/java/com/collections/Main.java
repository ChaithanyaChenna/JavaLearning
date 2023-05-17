package com.collections;

import java.util.*;

public class Main {
    public static <list> void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hi");
        list.add("hello");
        Iterator itr= list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        for (Object e:list) {
            System.out.println(e);
        }
        Set<String> set=new HashSet<>(list);
        System.out.println(set); //[hi, hello]

        List<String> list1=new ArrayList<>();

        list1.add("Adithi");
        list1.add("sushma");
        list1.add("baby");
        list1.add("sahana");
        list1.add("bhanavi");
       Collections.sort(list1);
       System.out.println(list1);
       Collections.reverse(list1);
       System.out.println(list1);
       list1.stream().forEach(a -> System.out.println(a));
        //list1.stream().filter(x ->x.equals("baby")).forEach(System.out::println);
        list1.stream().filter(String::isBlank).forEach(System.out::println);
       // Arrays.stream()
       // List<Integer> l1 =new ArrayList<Integer>();
        int numbers[]={1,2,3,4,5};
        System.out.println(Arrays.stream(numbers).sum()) ;

        List<String> list2=new ArrayList<>();
        String num[]={"1","2","3","4","5"};
       // Arrays.stream(num).

        int sum= Arrays.stream(num).map(each -> Integer.parseInt(each)).reduce(0,(a,b) ->a+b);
        System.out.println(sum);
        Optional<Integer> reduce = Arrays.stream(num).map(Integer::parseInt).reduce(Integer::sum);
        if(reduce.isPresent())
        {
            System.out.println(reduce.get());
        }
        //System.out.printf("");
        //System.out.println("args = " + Arrays.toString(args));
        //System.out.println(sum);


    }
}
