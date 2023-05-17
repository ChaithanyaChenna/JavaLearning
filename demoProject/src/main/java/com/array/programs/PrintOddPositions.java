package com.array.programs;

public class PrintOddPositions {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (count % 2 != 0) {
                System.out.println(arr[i]);
            }
            count++;
        }
    }
}
