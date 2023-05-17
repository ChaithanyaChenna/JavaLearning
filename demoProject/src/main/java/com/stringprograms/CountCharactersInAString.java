package com.stringprograms;

public class CountCharactersInAString {
    public static void main(String args[])
    {

        //In this program it acts one space as one character
        String a="helloWorldHi  Program";
        char b[]=a.toCharArray();
        System.out.println("the total number of characters in a given string is "+b.length);

    }
}
