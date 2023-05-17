package com.collectionsofTreeset;

import java.util.Comparator;

public class NickNameCompare implements Comparator<FriendsMarks> {

    @Override
    public int compare(FriendsMarks obj1, FriendsMarks obj2) {

       return obj1.getNickName().compareTo(
                obj2.getNickName());
    }
}
