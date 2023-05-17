package com.array.programs;

import java.util.Arrays;

import java.util.Collections;

public class ArraySortDescendingMethod1 {
    public static void main(String args[])
    {
        Integer a[]={1,3,5,6,7,3,5};
        //Arrays.sort(a);
        Arrays.sort(a, Collections.reverseOrder());
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
