package com.numberpro;

public class nPrPermutations {
    public static int nPr(int n,int r)
    {
        int a=fact(n)/fact(n-r);
        return a;
    }
    public static int fact(int num)
    {
        int sum=1;
        for(int i=1;i<num;i++)
        {
         sum=sum*(i+1);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int nPr=nPr(3,2);
        System.out.println(nPr);
    }
}
