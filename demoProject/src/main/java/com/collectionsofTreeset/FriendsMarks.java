package com.collectionsofTreeset;

public class FriendsMarks {

    String name;
    String nickName;
    int marks;
    FriendsMarks(String name,String nickName,int marks)
    {
     this.name=name;
     this.nickName=nickName;
     this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
        public String toString()
        {
            return  "friendsMarks{"
                    + "name='" + name + '\'' + ", nickName='"
                    + nickName + '\'' + ", marks=" + marks + '}';
        }
}
