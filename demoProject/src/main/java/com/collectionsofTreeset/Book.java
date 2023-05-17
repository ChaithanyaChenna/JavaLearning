package com.collectionsofTreeset;

public class Book implements Comparable<Book>
{
    int id;
    String name,author;
    Book(int id,String name,String author)
    {
        this.id=id;
        this.name=name;
        this.author=author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int compareTo(Book b) {
        if(id>b.id)
        {
        return 1;
        }
        else if (id< b.id)
        {
            return -1;
        }else
            return 0;

        }
    }
