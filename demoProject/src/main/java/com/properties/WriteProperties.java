package com.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        p.setProperty("name","chaithanya");
        p.setProperty("schoolName","SVVS");
       // p.store(new FileWriter("C:\\Users\\My PC\\IdeaProjects\\demoProject\\src\\main\\resources\\db.properties"),"JavaTponit");
   FileWriter fw=new  FileWriter("C:\\Users\\My PC\\IdeaProjects\\demoProject\\src\\main\\resources\\db.properties");
    p.store(fw,"JavaTpont");
    }
}
