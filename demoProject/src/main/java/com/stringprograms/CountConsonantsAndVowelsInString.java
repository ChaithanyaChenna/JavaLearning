package com.stringprograms;

public class CountConsonantsAndVowelsInString {
    public static void main(String args[])
    {
        String str="Java Program";
        str=str.toLowerCase();
        int count=0;
        int count1=0;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count1++;
            }
        }
            System.out.println("the number of vowels is "+count);
            System.out.println("the number of consonants is "+count1);
        }
    }
