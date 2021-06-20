/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex43;

import java.io.IOException;
import java.util.Scanner;

public class solution43 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //create new website generator
        WebsiteGenerator site = new WebsiteGenerator();

        //prompt for inputs and pass data to website generator
        System.out.print("Site Name: ");
        site.setName(in.nextLine());
        System.out.print("Author: ");
        site.setAuthor(in.nextLine());
        System.out.print("Do you want a folder for JavaScript? ");
        site.setJS(toBoolean(in.nextLine()));
        System.out.print("Do you want a folder for CSS? ");
        site.setCSS(toBoolean(in.nextLine()));

        //create website directory
        //create html file
        String output = site.generateWebsite();
        System.out.println(output);
    }

    public static boolean toBoolean(String answer)
    {
        return answer.equalsIgnoreCase("y");
    }
}
