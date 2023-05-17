package com.array.programs;

import java.util.Arrays;

public class ArraySortAscendingMethod1 {
    public static void main(String args[])
    {
        int a[]={2,5,2,6,5,4,3,1,7};
        Arrays.sort(a);
        System.out.println("Elements of array sorted in Ascending order");
        System.out.println(Arrays.toString(a));
        // [or]
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.println(a[i]);
//        }
    }
}
