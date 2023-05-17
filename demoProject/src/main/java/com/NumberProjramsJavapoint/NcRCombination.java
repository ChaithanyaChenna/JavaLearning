package com.NumberProjramsJavapoint;

public class NcRCombination {

    public static int nCr(int n,int r)
    {
        int a=fact(n)/(fact(r)*fact(n-r));
        return a;
    }
    public static int fact(int num)
    {
        int k=1;
        for(int i=1;i<=num;i++)
        {
             k=k*i;
        }
        return k;
    }
    public static void main(String args[])
    {
        NcRCombination obj=new NcRCombination();
       int a= obj.nCr(4,2);
       System.out.println(a);

    }
}
