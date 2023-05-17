package com.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\My PC\\IdeaProjects\\demoProject\\src\\main\\resources\\db.properties");
        Properties p = new Properties();
        p.load(fr);
        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));


    }
}
