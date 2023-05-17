package com.NumberProjramsJavapoint;

public class KaprekarNum {
    public void kaprekar(int n) {

        int count = 0, num, sq, a, b, sum;
        sq = n * n;
        num = n;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        a = sq / (int) Math.pow(10, count);
        b = sq % (int) Math.pow(10, count);
        sum=a+b;
        if (num == sum) {
            System.out.println(num);
        }
    }



    public static void main(String[] args)
        {
       KaprekarNum k=new KaprekarNum();
        for (int i = 1; i <= 100; i++) {
           k.kaprekar(i);
            }
        }

    }
