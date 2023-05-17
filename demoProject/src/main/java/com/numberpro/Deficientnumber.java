package com.numberpro;

public class Deficientnumber {

    public static int calSum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int num=24;
        int sum=calSum(num);
        System.out.println(sum);

        if(sum<num)
        {
            System.out.println("the given number is Dificient number");
        }
        else {
            System.out.println("the given number is not dificient number");
        }

    }
}