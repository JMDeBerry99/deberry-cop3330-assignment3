/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class solution45 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //read in file
        Scanner file = new Scanner(new File("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming" +
                "\\deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex45\\exercise45_input.txt"));
        String input = readIN(file);

        //search for utilize and replace with use
        String output = input.replaceAll("utilize", "use");

        //prompt for name of output file
        System.out.print("Enter name for output file: ");
        String outputFileName = in.nextLine();

        //write to output file
        writeOUT(outputFileName, output);
    }

    public static String readIN(Scanner file)
    {
        String input = "";
        while(file.hasNextLine())
        {
            input += file.nextLine();
        }
        return input;
    }

    public static void writeOUT(String outputFileName, String output) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming\\" +
                "deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex45\\" + outputFileName + ".txt");
        fileWriter.write(output);
        fileWriter.close();
    }
}
