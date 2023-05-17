package com.collectionsofTreeset;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample1{
    public static void main(String[] args) {
        TreeSet<FriendsMarks> treeSet=new TreeSet<>(new MarksCompare());
        treeSet.add(new FriendsMarks("Raushan", "Chamgader", 99));
        treeSet.add(new FriendsMarks("Yashdeep", "Dopa", 95));
        treeSet.add(new FriendsMarks("Rupesh", "Gian", 92));
        treeSet.add(new FriendsMarks("Shivam", "Gorilla", 47));
        treeSet.add(new FriendsMarks("Sarthak", "Nagin", 78));
        treeSet.add(new FriendsMarks("Sonika", "Chipkali", 67));
        treeSet.add(new FriendsMarks("Himanshu", "Lalten", 57));

        System.out.println("Sorting on the basis of marks");
      //  System.out.println(treeSet);

        //Displaying by using loop
        for (FriendsMarks f:treeSet) {
            System.out.println(f);

        }
        TreeSet<FriendsMarks> treeSet1
                = new TreeSet<>(new NameCompare());
        // adding elements to TreeSet
        treeSet1.add(new FriendsMarks("Raushan", "Chamgader", 99));
        treeSet1.add(new FriendsMarks("Yashdeep", "Dopa", 95));
        treeSet1.add(new FriendsMarks("Rupesh", "Gian", 92));
        treeSet1.add(new FriendsMarks("Shivam", "Gorilla", 47));
        // Displaying using loop
        System.out.println("\n\nSorting on the basis of name");

        for (FriendsMarks tree : treeSet1)
            System.out.println(tree);

        TreeSet<FriendsMarks> ts=new TreeSet<>(new NickNameCompare());
        ts.add(new FriendsMarks("Raushan", "Chamgader", 99));
        ts.add(new FriendsMarks("Yashdeep", "Dopa", 95));
        ts.add(new FriendsMarks("Rupesh", "Roopa", 92));
        ts.add(new FriendsMarks("Shivam", "Anu", 47));

        System.out.println("Sorting on the basis of nickName");

        for (FriendsMarks tree : ts)
            System.out.println(tree);

        }
    }

