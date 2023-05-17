package com.numberpro;

public class PrimeNumbersFirst10 {
    public static int IsPrimeNumber(int num) {
        int temp = 0;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                temp = temp + 1;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int temp = IsPrimeNumber(i);
            if (temp == 0) {
                System.out.println(i);
                count++;
            }
            if (count == 10) {
                break;
            }
        }
    }
}
