package com.NumberProjramsJavapoint;

public class NumberProgram7 {

    // Program to determine whether a given number is a Deficient number
    public static void main(String[] args) {

        int i=1, num = 2, sum = 0;
        {
            while (i >= 1) {
                if(i==num)
                {
                    break;
                }
                if (num % i == 0) {
                    sum = sum + i;
                }
                i++;
            }
            System.out.println(sum);
            if(sum<num)
            {
                System.out.println("the given number is Deficient number");
            }
            else
            {
                System.out.println("the given number is not a Deficient number");
            }
        }

    }
}