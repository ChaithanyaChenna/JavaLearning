package com.finalkeyword;

public class FinalVariable {
    int a = 10;
    final int b=60;


    public static void main(String args[]) {
        FinalVariable s = new FinalVariable();
        System.out.println(s.a);
        s.a=20;
        System.out.println(s.a);
        //s.b=50;
    }
}
