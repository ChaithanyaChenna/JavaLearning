package com.java8BySdet.PredicateFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class DemoEmployee {

    public static void main(String[] args) {

       // ex:1
        Employee emp=new Employee("Scott",60000,8);
        //emp obj--->return name if emp sal>50k and exp>5

        Predicate<Employee> pr=e->((e.salary>50000)&&(e.experience>5));
        System.out.println( pr.test(emp));
        if(pr.test(emp))
        {
            System.out.println(emp.ename);
        }

        //ex:2
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee("David",40000,7));
        list.add(new Employee("James",60000,8));
        list.add(new Employee("Levis",30000,9));
        for(Employee e:list)
        {
            if(pr.test(e))
            {
                System.out.println(e.ename+" "+e.salary);
            }
        }

    }
}
