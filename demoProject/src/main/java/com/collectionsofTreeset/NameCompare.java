package com.collectionsofTreeset;

import java.util.Comparator;

public class NameCompare implements Comparator<FriendsMarks> {

    @Override
    public int compare(FriendsMarks f1, FriendsMarks f2) {
        return f1.getName().compareTo(
                f2.getName());
    }
}
