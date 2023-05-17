package com.PrcaticePrograms;

public interface I1 {

    int a=10;
    public String str="happy";
     public void m1();
     public default int m2()
     {
         return a;
     }
}

