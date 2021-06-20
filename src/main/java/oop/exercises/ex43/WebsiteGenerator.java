/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteGenerator {
    private String siteName = "";
    private String author = "";
    private boolean js = false;
    private boolean css = false;

    public void setName(String nextLine) {
        siteName = nextLine;
    }

    public void setAuthor(String nextLine) {
        author = nextLine;
    }

    public void setJS(boolean toBoolean) {
        js = toBoolean;
    }

    public void setCSS(boolean toBoolean) {
        css = toBoolean;
    }

    public String generateWebsite() throws IOException {
        String output = "";
        //create site folder
        File siteDirectory = new File("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming" +
                "\\deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex43\\" + siteName);
        boolean bool = siteDirectory.mkdir();
        if(bool)
            output += "Created ./ex43/" + siteName + "\n";
        else
            output += "Error when creating site directory\n";

        //create index.html
        File index = new File("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming" +
                "\\deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex43\\" + siteName + "\\index.html");
        index.getParentFile().mkdirs();
        bool = index.createNewFile();
        if(bool)
            output += "Created ./ex43/" + siteName + "/index.html\n";
        else
            output += "Error when creating index.html file\n";

        //write index.html
        FileWriter writer = new FileWriter(index);
        writer.write("<html><title>" + siteName + "</title><meta>" + author + "</meta></html>");
        writer.close();

        //create js folder
        if(js)
        {
            File jsFolder = new File("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming" +
                    "\\deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex43\\" + siteName + "\\js");
            bool = jsFolder.mkdir();
            if(bool)
                output += "Created ./ex43/" + siteName + "/js/\n";
            else
                output += "Error when creating JavaScript folder\n";
        }

        //create css folder
        if(css)
        {
            File cssFolder = new File("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming" +
                    "\\deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex43\\" + siteName + "\\css");
            bool = cssFolder.mkdir();
            if(bool)
                output += "Created ./ex43/" + siteName + "/css/\n";
            else
                output += "Error when creating CSS folder\n";
        }

        return output;
    }
}
