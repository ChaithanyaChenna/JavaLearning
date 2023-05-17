package com.array.programs;

public class LeftRotation1 {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int temp=a[0];
        int n=1;
        for(int i=0;i<a.length-n;i++)
        {
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
