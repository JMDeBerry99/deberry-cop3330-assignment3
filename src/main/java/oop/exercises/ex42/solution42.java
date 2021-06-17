/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex42;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class solution42 {
    public static void main(String[] args) throws IOException {

        //reads in data line by line
        File inFile = new File("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming\\" +
                "deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex42\\exercise42_input.txt");
        Scanner sc = new Scanner(inFile);
        DataFormatter formatter = new DataFormatter();
        while(sc.hasNextLine())
        {
            formatter.process(sc.nextLine());
        }

        //breaks up data by category and formats into chart
        formatter.createChart();

        //prints chart
        String output = formatter.printChart();
        FileWriter fileWriter = new FileWriter("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming\\" +
                "deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex42\\exercise42_output.txt");
        fileWriter.write(output);
        fileWriter.close();

    }
}
