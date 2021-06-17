/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class solution41 {
    public static void main(String[] args) throws IOException {
        //read in list of names from file and adds to NameSorter object's list of names
        File inFile = new File("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming\\" +
                "deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex41\\exercise41_input.txt");
        Scanner sc = new Scanner(inFile);
        NameSorter sorter = new NameSorter();
        while(sc.hasNextLine())
        {
            sorter.add(sc.nextLine());
        }

        //Name Sorter sorts names alphabetically
        sorter.sortByLastName();

        //prints sorted list to output file
        String output = sorter.toString();
        FileWriter fileWriter = new FileWriter("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming\\" +
                "deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex41\\exercise41_output.txt");
        fileWriter.write(output);
        fileWriter.close();

    }
}
