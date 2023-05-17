package com.NumberProjramsJavapoint;

public class Permutations {
    public static int nPr(int n,int r)
    {
        int a=fact(n)/fact(n-r);
        return a;
    }
    public static int fact(int n)
    {
        int res=1;
      for(int i=1;i<=n;i++)
      {
           res=res*i;
      }
      return res;
    }
    public static void main(String args[])
    {
        Permutations p=new Permutations();
       int a= nPr(3,2);
       System.out.println(a);
    }
}
