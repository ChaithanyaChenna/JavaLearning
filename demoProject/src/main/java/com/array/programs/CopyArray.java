package com.array.programs;

public class CopyArray {
    public static void main(String[] args)
    {
        int a1[]={1,2,3,4,5};
        int[] a2=new int[5];
        for (int i=0;i<a1.length;i++)
        {
            for (int j = 0; j<=i; j++) {
                a2[j] = a1[i];
                //System.out.println(a2[j]);
            }
        }
        for(int i=0;i<a2.length;i++)
        {
            System.out.println(a1[i]);
        }
    }
}
