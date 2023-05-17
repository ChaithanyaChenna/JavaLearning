package com.collectionsofTreeset;

import java.util.Comparator;

public class MarksCompare implements Comparator<FriendsMarks> {
    @Override
    public int compare(FriendsMarks f11, FriendsMarks f22) {
        if (f11.getMarks() > f22.getMarks()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
